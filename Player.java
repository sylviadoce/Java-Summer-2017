package jumper;

import apcs.Window;

public class Player {

	int x = 250;
	int y = 450;
	int dx = 0;
	int dy = 0;
	
	public void draw() {
		Window.out.color("sky blue");
		Window.out.circle(x, y, 10);
	}

	public void move() {
		//rule of position by changing speed
		x = x + dx;
		y = y + dy;
		
		//rule of gravity
		dy = dy + 1;
		
		
		//controlling jumping
		control();
		boundaries();
		
	}

	private void control() {
		if (Window.key.pressed("up")) {
			dy = -10;
		}
		if (Window.key.pressed("left")) {
			dx--;
		}
		if (Window.key.pressed("right")) {
			dx++;
		}
		
	}

	private void boundaries() {
		if (x < 10) {
			x = 10;
			dx = -dx;
		}
		if (x > 490) {
			x = 490;
			dx = -dx;
		}
		//rule of ground
		if (y > 450) {
			y = 450;
		}
		
	}

	public boolean isOn(Platform p) {
		// TODO Auto-generated method stub
		return false;
	}

	public void beOn(Platform p) {
		// TODO Auto-generated method stub
		
	}

}
