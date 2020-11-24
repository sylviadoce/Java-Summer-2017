package brickbreakinggame;

import apcs.Window;
import soccer.Player;

public class BrickBreakingGame {

	public static void main(String[] args) {
		Window.size(800, 800);
		Player p = new Player();
		
		while (true) {
			Window.frame();
			Window.out.background("white");
			
			p.draw();
			p.move();
		}

	}

}
