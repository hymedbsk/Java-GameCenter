package serpent;

public class PartSerpent {

	public int x, y, direction;
    
    public PartSerpent(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    
    public void mouvement() {
        if(direction == 37 || direction == 39) {
            x += (direction == 37) ? -1 : 1;
            if(x > 13)
                x = -1;
            else if(x < -1)
                x = 13;
        }else {
            y += (direction == 38) ? -1 : 1;
            if(y > 13)
                y = -1;
            else if(y < -1)
                y = 13;
        }
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new PartSerpent(x, y, direction);
    }
}

