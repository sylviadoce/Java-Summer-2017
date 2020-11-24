package apcs;

public class Tag {

	public static void main(String[] args) {
		
		// My position
		int x = 100;
		int y = 100;
		
		int playertwox = 400;
		int playertwoy = 100;
		
		int it = 1;
		
		// Infinitely draw frames
		while (true) {
			
			//If the two circles are touching
			if ( Math.abs(x - playertwox) < 40 && Math.abs(y - playertwoy) < 40) {
				System.out.println("tagging");
				//Who is it
				if (it == 1) {
					it = 2;
				}
				else {
					it = 1;
				}
				
			}
			
			Window.out.background("black");
			if (it == 1) {
				Window.out.color("white");
				Window.out.circle(x, y, 15);
			}
			
			Window.out.color("red");
			Window.out.circle(x, y, 10);
		
			
			if (Window.key.pressed("right") ) { 
				x = x + 10;
			}
			
			if (Window.key.pressed("left") ) { 
				x = x - 10;
			}
			
			if (Window.key.pressed("down") ) { 
				y = y + 10;
			}
			
			if (Window.key.pressed("up") ) { 
				y = y - 10;
			}
			
			
		//Player  Two
			if (it == 2) {
				Window.out.color("white");
				Window.out.circle(playertwox, playertwoy, 15);
			}
			
			Window.out.color("blue");
			Window.out.circle(playertwox, playertwoy, 10);
			
			if (Window.key.pressed("d") ) { 
				playertwox = playertwox + 10;
			}
			
			if (Window.key.pressed("a") ) { 
				playertwox = playertwox - 10;
			}
			
			if (Window.key.pressed("s") ) { 
				playertwoy = playertwoy + 10;
			}
			
			if (Window.key.pressed("w") ) { 
				playertwoy = playertwoy - 10;
			}
			
			//Gets rid of flickering
			Window.frame();
			
			
				
				
		}

	}

}
