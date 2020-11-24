package spaceinvaders;

import apcs.Window;

public class Spaceship {
	
	int x = 300;
	int y = 750;

	public void draw() {
		Window.out.color("green");
		Window.out.rectangle(x, y, 40, 20);
		Window.out.color("green");
		Window.out.rectangle(x, y - 10, 5, 20);
	}

	public void move() {
		if (Window.key.pressed("left")) {
			x = x - 10;
		}
		
		if (Window.key.pressed("right")) {
			x = x + 10;
		}
		
	}

}
