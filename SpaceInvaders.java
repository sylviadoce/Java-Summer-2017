package spaceinvaders;

import apcs.Window;
import java.util.ArrayList;

public class SpaceInvaders {

	public static void main(String[] args) {
		Window.size(600,800);
		Spaceship ship = new Spaceship();
		
		ArrayList<Bullet> bullets = new ArrayList<Bullet> ();
		int bulletStopwatch = 0;
		
		ArrayList <Invader> invaders = new ArrayList <Invader> ();		
		while (true) {
			Window.frame();
			
			ship.draw();
			ship.move();
			
			if (Window.random(1, 30) == 1) {
				invaders.add(new Invader());
			}
			
			for (int i = 0 ; i < invaders.size(); i++) {
				Invader inv = invaders.get(i);
				inv.draw();
				inv.move();
				
				for (int j = 0 ; j < bullets.size() ; j++) {
					Bullet b = bullets.get(j);
					if (inv.isTouching(b)) {
						invaders.remove(i);
						bullets.remove(j);
					}
				}
			}
			
			if (Window.key.pressed("space")) {
				
				if (bulletStopwatch == 0) {
					Bullet b = new Bullet(ship);
					bullets.add(b);
					bulletStopwatch = 10;
				}
			}
				
			if (bulletStopwatch > 0) {
				bulletStopwatch--;
			}
			
			for (int i = 0 ; i < bullets.size(); i++) {
				Bullet b = bullets.get(i);
				b.draw();
				b.move();
			}
			
		}

	}

}
