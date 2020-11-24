package jumper;

import java.util.ArrayList;

import apcs.Window;

public class Jumper {

	public static void main(String[] args) {
		//What do I have one of?
		Player sylvia = new Player();
		
		//What do I have many of?
		ArrayList<Platform> platforms = new ArrayList <Platform> ();
		
		//infinite animation loop
		while (true) {
			Window.frame();
			
			//draw and move everything
			sylvia.draw();
			sylvia.move();
			
			//draw and move every object in the list
			for (Platform p : platforms) {
				p.draw();
				p.move();
				
				if (sylvia.isOn(p)) {
					sylvia.beOn(p);
				}
			}
		}

	}

}
