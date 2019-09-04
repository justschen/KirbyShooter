import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class particles extends Rectangle {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double gravity;
	double dx;
	double dy;
	
	Random r1 = new Random();

	public particles(int x, int y) {
		
		gravity = 1;
		this.setSize(7,7);
		this.setLocation(x,y);
		dx = 10*(r1.nextDouble() - 2);
		dy = 1*(r1.nextInt(5) - 2);
		
	}
	
	public void moveAndDraw(Graphics2D win) {
		
		this.translate((int)dx,  (int)dy);
		win.setColor(Color.RED);
		win.fill(this);
		
	}
}


