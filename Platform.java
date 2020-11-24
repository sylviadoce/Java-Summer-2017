package jumper;

import apcs.Window;

public class Platform {
	
	int x = Window.random(0, 500);
	int y = -10;

	public void draw() {
	y = y + 5;
		
	}

	public void move() {
		Window.out.color("white");
		Window.out.rectangle(x, y, 50, 5);
		
	}

}
