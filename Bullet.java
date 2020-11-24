package spaceinvaders;

import apcs.Window;

public class Bullet {
	int x;
	int y;
	
	public Bullet (Spaceship ship) {
		x = ship.x;
		y = ship.y - 20;
	}

	public void draw() {
		Window.out.color("white");
		Window.out.rectangle(x, y, 5, 20);
	}
		
	public void move() {
		y = y - 10;
	}
}
