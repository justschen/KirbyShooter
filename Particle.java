import java.awt.Color;
import java.awt.Graphics2D;


public class Particle {
	
	int x,y;
	int vx,vy;
	int count=20;
	public Particle(int x, int y) {
		this.x=x;
		this.y=y;
		this.vx=(int) (Math.random()*7-3);
		this.vy=(int) (Math.random()*7-3);
		
	}
	
	public void draw (Graphics2D win) {
		win.setColor(Color.RED);
		win.fillOval(x, y, 5, 5);
		win.setColor(Color.BLACK);
		
		x=x+vx;
		y=y+vy;
		count--;
		
	}
	public boolean isDead() {
		
		return false;
		//return count<0;
	}	
}


