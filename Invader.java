package spaceinvaders;

import apcs.Window;

public class Invader {
	
	int x = Window.random(0,  600);
	int y = -50;
	int type = Window.random(1, 5);

	public void Invader() {
		
	}
	
	public void draw() {
		Window.out.color("beige");
		Window.out.square(x, y, 30);
	}
	
	public void move() {
		y = y + 5;
		
	}

	public boolean isTouching(Bullet b) {
		int diffx = x - b.x;
		int diffy = y - b.y;
		
		if (Math.abs(diffx) < 50 && Math.abs(diffy) < 40) {
			return true;
		}
		return false;
	}

}
