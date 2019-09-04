import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Lasers extends Rectangle{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int dx = 30;
	Rectangle HPBAR;
	int livesbar = 100;

	//int delay = 50, timer = 0;
	

	public Lasers(int x, int y) {
		this.setSize(20,20);
		this.setLocation(x, y);
	}
	
	public void moveAndDraw(Graphics2D win) {
		//timer++;
		this.translate(dx, 0);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
		//Main.sounds.play(10);
		
		win.drawImage(Main.midshot.loop(), null, this.x, this.y);
		if (this.intersects(new BossClass().hitbox)) {
			new BossClass( ).lives--;
			
		}
	}
	
	public void movebot (Graphics2D win) {
		this.translate(dx, 12);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
		//Main.sounds.play(10);
		
		win.drawImage(Main.botshot.loop(), null, this.x, this.y);
		if (this.intersects(new BossClass().hitbox)) {
			new BossClass().lives--;
			
		}
	}
	
	public void movetop(Graphics2D win) {
		this.translate(dx, -12);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
		
		//Main.sounds.play(10);
		win.drawImage(Main.topshot.loop(), null, this.x, this.y);
		if (this.intersects(new BossClass().hitbox)) {
			new BossClass().lives--;
			
		}
	}
	
	public void nmegun(Graphics2D win) {
		this.translate(-10, 0);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
		win.drawImage(Main.waddleshot, null, this.x, this.y);
		
		if (this.intersects(new Ship().hitbox)) {
			new Ship().hp--;
		}
		
		
	}
	
	public void nme3gun(Graphics2D win) {
		this.translate(-10, 0);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
			win.drawImage(Main.shockbeam, null, this.x, this.y);
		
		if (this.intersects(new Ship().hitbox)) {
			new Ship().hp--;
		}
		
	}

	public void movebotboss (Graphics2D win) {
		this.translate(-15, 12);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
		
		win.drawImage(Main.canon, null, this.x, this.y);
		if (this.intersects(new Ship().hitbox)) {
			new Ship().hp--;
			
		}
	}
	
	public void movetopboss(Graphics2D win) {
		this.translate(-15, -12);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
		
		win.drawImage(Main.canon, null, this.x, this.y);
		if (this.intersects(new Ship().hitbox)) {
			new Ship().hp--;
			
		}
	}
	
	public void moveAndDrawboss(Graphics2D win) {
		//timer++;
		this.translate(-15, 0);
		win.setColor(Color.RED);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(this);
		}
		
		win.drawImage(Main.canon, null, this.x, this.y);
		if (this.intersects(new Ship().hitbox)) {
			new Ship().lives--;
			
		}
	}
	
}
