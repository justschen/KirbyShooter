import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class BossDee extends Rectangle{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int movex = 675+400, movey = 400;
	static int xx = 675;
	int dx = 9, dy = 9;
	public Rectangle hitbox;
	int lives = 100;
	int hp = 300;
	Rectangle hpbox;
	public Rocket rocket;
	int attackx = 5, attacky=5;
	Boolean returnto = false;
	Boolean spinattack = false;
	Warning warn = new Warning();

	
	public BossDee() {
		this.setSize(200,204);
		this.setLocation(movex,movey);
		hitbox = new Rectangle(movex+60,movey+100,170,140);
		//rocket = new Rocket(ship);
	}

	public void draw(Graphics2D win) {
		// TODO Auto-generated method stub
		win.setColor(Color.WHITE);
		win.fillRect(606+160, 665, 208, 40+20);
		win.setColor(Color.BLACK);
		win.fillRect(610+160, 670, 200, 30+20);
		win.setColor(Color.BLUE);
		win.fillRect(610+160,670,hp-100, 30+20);
		win.setColor(Color.BLACK);
		
		
		win.drawImage(Main.waddleicon, null, 600, 620);
		if(win!=null) {
		win.setColor(Color.BLACK);
		
		
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(hitbox);
		}
		
		}
	}
	
	public void return2(Graphics2D win) {
		win.setColor(Color.WHITE);
		win.fillRect(606+160, 665, 208, 40+20);
		win.setColor(Color.BLACK);
		win.fillRect(610+160, 670, 200, 30+20);
		win.setColor(Color.BLUE);
		win.fillRect(610+160,670,hp-100, 30+20);
		win.setColor(Color.BLACK);
		
		win.drawImage(Main.waddleicon, null, 600, 620);
		this.translate(10, 0);
		hitbox.translate(10, 0);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(hitbox);
		}
	}
	
	public void movingin(Graphics2D win) {
		this.translate(-2, -1);
		hitbox.translate(-2, -1);
		
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(hitbox);
		}
		
	}
	
	public void dying(Graphics2D win) {
		this.translate(1, 2);
	}
	
	
	public void spinningattack(Graphics2D win, Ship ship) {
		this.translate(-dx, dy);
		hitbox.translate(-dx, dy);
		win.setColor(Color.WHITE);
		win.fillRect(606+160, 665, 208, 40+20);
		win.setColor(Color.BLACK);
		win.fillRect(610+160, 670, 200, 30+20);
		win.setColor(Color.BLUE);
		win.fillRect(610+160,670,hp-100, 30+20);
		win.setColor(Color.BLACK);
		
		win.drawImage(Main.waddleicon, null, 600, 620);
		
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(hitbox);
		}
		
		if (this.intersects(ship)) {
			ship.lives--;
			ship.hpbar-=2;
			warn.hpflash(win);
		}
		
		if (this.getX() < 0) {
			dx*=-1;
			
		}
		
		if (this.getY() > 450) {
			dy*=-1;
		}
		
		if (this.getY() < -10) {
			dy*=-1;
		}
		
		if (this.getX() >670) {
			dx*=-1;
		}
		
		for (int j = 0; j < ship.Lasers1.size(); j++) {
			Lasers bullet = ship.Lasers1.get(j);
			
			if (bullet!=null) {
				if (bullet.intersects(this)){
					Main.sounds.play(1);
					ship.Lasers1.remove(j);
					j--;
					lives--;
					hp-=2;
		}			
	}
}
for (int j = 0; j < ship.Lasers2.size(); j++) {
	Lasers bullet = ship.Lasers2.get(j);
	
	if (bullet!=null) {
		if (bullet.intersects(this)){
			Main.sounds.play(1);
			ship.Lasers2.remove(j);
			j--;
			lives--;
			hp-=2;
			warn.bossflash(win);
}			
}
}
for (int j = 0; j < ship.Lasers3.size(); j++) {
	Lasers bullet = ship.Lasers3.get(j);
	
	if (bullet!=null) {
		if (bullet.intersects(this)){
			Main.sounds.play(1);
			ship.Lasers3.remove(j);
			j--;
			lives--;
			hp-=2;
			warn.bossflash(win);
}			
}
}
		
	}  
		
	
	
	public void returnto(Graphics2D win) {
		this.setLocation(movex,movey);
		hitbox = new Rectangle(movex+60,movey+100,170,140);
		win.setColor(Color.WHITE);
		win.fillRect(606+160, 665, 208, 40+20);
		win.setColor(Color.BLACK);
		win.fillRect(610+160, 670, 200, 30+20);
		win.setColor(Color.BLUE);
		win.fillRect(610+160,670,hp-100, 30+20);
		win.setColor(Color.BLACK);
		
		win.drawImage(Main.waddleicon, null, 600, 620);
		
	}
	
	public void movement(Graphics2D win, Ship ship) {
		this.translate(0, dy);
		hitbox.translate(0, dy);
		win.setColor(Color.WHITE);
		win.fillRect(606+160, 665, 208, 40+20);
		win.setColor(Color.BLACK);
		win.fillRect(610+160, 670, 200, 30+20);
		win.setColor(Color.BLUE);
		win.fillRect(610+160,670,hp-100, 30+20);
		win.setColor(Color.BLACK);
		
		win.drawImage(Main.waddleicon, null, 600, 620);
		if 	(GameDriverV4.Keys[KeyEvent.VK_SPACE]) {
			win.fill(hitbox);
		}
		
		
		if (this.getY() > 450) {
			dy*=-1;
		}
		
		if (this.getY() < -10) {
			dy*=-1;
		}
		
		
		
		if (this.intersects(ship)) {
			ship.lives--;
			ship.hpbar-=2;
			warn.hpflash(win);
		}  
		
		for (int j = 0; j < ship.Lasers1.size(); j++) {
					Lasers bullet = ship.Lasers1.get(j);
					
					if (bullet!=null) {
						if (bullet.intersects(this)){
							Main.sounds.play(1);
							ship.Lasers1.remove(j);
							j--;
							lives--;
							hp-=2;
							warn.bossflash(win);
				}			
			}
		}
		for (int j = 0; j < ship.Lasers2.size(); j++) {
			Lasers bullet = ship.Lasers2.get(j);
			
			if (bullet!=null) {
				if (bullet.intersects(this)){
					Main.sounds.play(1);
					ship.Lasers2.remove(j);
					j--;
					lives--;
					hp-=2;
					warn.bossflash(win);
		}			
	}
}
		for (int j = 0; j < ship.Lasers3.size(); j++) {
			Lasers bullet = ship.Lasers3.get(j);
			
			if (bullet!=null) {
				if (bullet.intersects(this)){
					Main.sounds.play(1);
					ship.Lasers3.remove(j);
					j--;
					lives--;
					hp-=2;
					warn.bossflash(win);
		}			
	}
}	
		
	}
}
		