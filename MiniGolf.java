package apcs;

public class MiniGolf {

	public static void main(String[] args) {
		Window.size(800, 600);
		
		double x = 100;
		double y = 100;
		double dx = 0;
		double dy = 0;
		
		int px = 0;
		int py = 0;
		int lastpx = 0;
		int lastpy = 0;
		
		int holex = Window.random(100,  750);
		int holey = Window.random(50,  550);
		
		while (true) {
			Window.frame();
			
			//draw the background
			Window.out.background("green");
			
			//draw the ball
			Window.out.color("white");
			Window.out.circle(x, y, 10);
					
			//draw the putter
			//draw the hole
			Window.out.color("black");
			Window.out.circle(holex, holey, 15);
			
			//touching the hole
			if ( Math.abs(x - holex) < 10 && Math.abs(y - holey) < 10) {
				System.out.println("point");
				holex = Window.random(100, 750);
				holey = Window.random(50, 550);
				dx = 0;
				dy = 0;
				
			}
				
			//draw the flag
			
			//move the ball
			
			x = x + dx;
			y = y + dy;
			
			dx = dx * 8 / 10;
			dy = dy * 8 / 10;
			
			//check if the ball is being hit by the putter
			lastpx = px;
			lastpy = py;
			px = Window.mouse.getX(); 
			py = Window.mouse.getY();
			
			if (Math.abs(px - x) < 15 && Math.abs(py - y) < 15) {
				dx = (x - px) * 3;
				dy = (y - py) * 3;
				
			}
				
			//check boundaries
				if (y > 590 || x < 10) {
					dy = -dy;
				
			//check if the ball is in the hole
					
			}
		
			
		
			
		}

	}

}
