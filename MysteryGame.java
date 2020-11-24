package apcs;

public class MysteryGame {

	public static void main(String[] args) {
		Window.size(400,  600);
		
		int x = 100;
		int y = 350;
		int dy = 0;
		
		int gap1 = Window.random(100, 400);
		int obstacle1x = 400;
		int obstacle2x = 600;
		int obstacle3x = 800;
		
		//Infinitely draw frames
		while (true)
		{
			Window.frame();
			
			//draw the background
			drawBackground();
			
			//Draw the obstacle
			drawObstacle(obstacle1x);
			drawObstacle(obstacle2x);
			
			//Draw the rock
			drawRock(x, y);
			
			//Move the rock
			y = y + dy;
			dy = dy + 1;
			
			if (Window.mouse.clicked()) {
				dy = -10;
			}
			
			//Move the obstacles
			obstacle1x -= 3;
			obstacle2x -= 3;
			obstacle3x -= 3;
			
			if (obstacle1x < -25) {
				obstacle1x = 425;
			}
			
			if (obstacle2x < -25) {
				obstacle2x = 425;
			}
			
			if ( Math.abs(x - obstacle1x) < 50) {
				if (Math.abs(y - 250) > 50) {
					y = 300;
					dy = 0;
					obstacle1x= 425;
					obstacle2x = 650;
				}
				
				
			//bird dies;reset
			if (y < 15) {
				y = 300;
				dy = 0;
				obstacle1x = 425;
				obstacle2x = 650;
			}
			
			//bird touches pole
			
			
			//Draw an obstacle
			//drawObstacle(200);
			//drawObstacle(400);
			
			}}
	}

	private static void drawObstacle(int x) {
		Window.out.color("sea green");
		Window.out.rectangle(x, 250, 50, 500);
		Window.out.color("sky blue");
		Window.out.rectangle(x, 250, 50, 100);
		
	}

	private static void drawRock(int i, int j) {
		Window.out.color("grey");
		Window.out.oval(i, j, 40, 30);
		
	}

	private static void drawBackground() {
		
		Window.out.background("sky blue");
		Window.out.color("dark green");
		Window.out.rectangle(200, 550, 400, 100);
		

		
	}

}
