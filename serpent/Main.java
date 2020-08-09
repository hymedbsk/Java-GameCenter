package serpent;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Main extends JPanel {

	private final int WIDTH = 50;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake");
		frame.setContentPane(new Main());
		frame.setSize(12*50, 12*50);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
	public Main() {
		
		setBackground(Color.WHITE);
		new Thread(new Runnable() {
			
			
			public void run() {
				while(true) {
					repaint();
					try {
						Thread.sleep(1000/60l);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0,0,WIDTH,WIDTH);
	}

}
