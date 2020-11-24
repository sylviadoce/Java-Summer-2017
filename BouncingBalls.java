package apcs;

public class BouncingBalls {

	public static void main(String[] args) {
		int [] x = new int[100];
		int [] y = new int[100];
		int [] dx = new int[100];
		int [] dy = new int[100];
		int [] color = new int[100];
		int [] r = new int [100];
		
		
		//Add initial values to the arrays
		for (int i = 0 ; i < 100 ; i = i + 1) {
			x[i] = Window.random(10,  490);
			y[i] = Window.random(10,  150);
			dx[i] = Window.random(-5, 5);
			dy[i] = Window.random(-5, 5);
			color[i] = Window.random(1,  5);
			r[i] = Window.random(1,  20); 
		}
		
		//Infinitely draw frames
		while (true) {
			Window.frame();
			Window.out.background("black");
			
		for (int i = 0 ; i < 100 ; i = i + 1) {
			if (color[i] == 1) {
				Window.out.color("sky blue");
			}
			if (color[i] == 2) {
				Window.out.color("pink");
			}
			if (color[i] == 3) {
				Window.out.color("light green");
			}
			if (color[i] == 4) {
				Window.out.color("light yellow");
			}
			if (color[i] == 5) {
				Window.out.color("lavender");
			}
			if (color[i] == 6) {
				Window.out.color("white");
			}
			Window.out.circle(x[i], y[i], r[i]);
			
			x[i] = x[i] + dx[i];
			y[i] = y[i] + dy[i];
			dy[i] = dy[i] + 0;
			
			
			if (x[i] > 490 || x[i] < 10) {
				dx[i] = -dx[i];
			}
			
			if (y[i] > 490 || y[i] < 10) {
				dy[i] = -dy[i];
			}
			
		}
	}

}}
