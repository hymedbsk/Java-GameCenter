package serpent;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.CenterController;
 
public class Snake extends JPanel{
 
    private final int WIDTH = 50;
    private PartSerpent partSerpent;
    private ArrayList<PartSerpent> snake = new ArrayList<>();
    private Point apple = new Point(0,0);
    private Random rand = new Random();
    private JButton btnLogout = new JButton("Se d\u00E9connecter");
    private CenterController centerController;
    private boolean isGrowing = false;
    private boolean gameLost = false;
    public int score ;
    private int offset = 0;
    private int newDirection = 39;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Center Snake");
        Snake panel = new Snake();
        frame.addKeyListener(new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                panel.onKeyPressed(e.getKeyCode()); 
            }
        });
        frame.setContentPane(panel);
        frame.setSize(13*50, 13*50);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
    }
 

    public Snake() {
    	       
        createApple();
        snake.add(new PartSerpent(0, 0, 39));
        setBackground(Color.WHITE);
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                while(true) {
                    repaint();
                    try {
                        Thread.sleep(1000/60l);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
    
    public void createApple() {
        boolean positionAvailable;
        do {
            apple.x = rand.nextInt(12);
            apple.y = rand.nextInt(12);
            positionAvailable = true;
            for(PartSerpent p : snake) {
                if(p.x == apple.x && p.y == apple.y) {
                    positionAvailable = false;
                    break;
                }
            }
        } while(!positionAvailable);
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if(gameLost) {
        	 
            g.setColor(new Color(255, 102, 0));
            g.setFont(new Font("Arial", 45, 45));
            g.drawString("Partie terminée,ton score : "+score, 13*50/2 - g.getFontMetrics().stringWidth("Partie terminée, ton score : "+score)/2, 13*50/2);
           
    		
            return;
        }
        
        offset += 5;
        PartSerpent head = null;
        if(offset == WIDTH) {
            offset = 0;
           
            try {
                head = (PartSerpent) snake.get(0).clone();
                head.mouvement();
                head.direction = newDirection;
                snake.add(0,head);
                if(head.x == apple.x && head.y == apple.y) {
                    isGrowing = true;
                    createApple();
                }
                if(!isGrowing)
                    snake.remove(snake.size() - 1);
                else
                    isGrowing = false;
            } catch (CloneNotSupportedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        g.setColor(Color.red);
        g.fillOval(apple.x*WIDTH + WIDTH/4, apple.y*WIDTH + WIDTH/4, WIDTH/2, WIDTH/2);
        
        g.setColor(new Color(255, 102, 0));
        for(PartSerpent p : snake) {
            if(offset == 0) {
                if(p != head) {
                    if(p.x == head.x && p.y == head.y) {
                        gameLost = true;
                       
                    }
                }
            }
            if(p.direction == 37 || p.direction == 39) {
                g.fillRect(p.x * WIDTH + ((p.direction == 37) ? -offset : offset), p.y*WIDTH, WIDTH, WIDTH);
            } else {
                g.fillRect(p.x * WIDTH, p.y*WIDTH + ((p.direction == 38) ? -offset : offset), WIDTH, WIDTH);
            }
        }
        
        g.setColor(Color.BLUE);
        g.drawString("Score : "+(snake.size() -1), 10, 20);
        
       
        	score =snake.size() -1;
        	
        
    }

    public void onKeyPressed(int keyCode) {
        if(keyCode >= 37 && keyCode <= 40) {
            if(Math.abs(keyCode - newDirection) != 2) {
                newDirection = keyCode;
            }
        }
    }
        
}