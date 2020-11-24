package apcs;

public class SpeedReader {

	public static void main(String[] args) {
		Window.size(800,  100);
		Window.setFrameRate(8);
		
		Window.out.font("Courier", 100);
		
		String text = "tremendously";
		
		int start = 0;
		int end = 1;
		int center = 200;
		
		//While I have a valid starting position
		while (start < text.length()) {
			
			//Keep pushing n forwards until it reaches a space
			while (end < text.length() && text.charAt(end) != ' ') {
				end = end + 1;
			}
			
			String word = text.substring(start, end);
			
			Window.out.background("black");
			Window.out.color("white");
			if (word.length() == 0) {
				
			}
			//1-2 letters
			else if (word.length() < 3) {
				Window.out.color("red");
				Window.out.print(word.substring(0, 1), center, 80);
				Window.out.color("white");
				Window.out.print(word.substring(1), center + 50, 80);
				
			}
			//3-5 letters
			else if (word.length() < 6) {
				Window.out.color("white");
				Window.out.print(word.substring(0, 1), center - 50, 80);
				Window.out.color("red");
				Window.out.print(word.substring(1, 2), center, 80);
				Window.out.color("white");
				Window.out.print(word.substring(2), center + 50, 80);
				
			}
			//6-8 letters
			else if (word.length() < 9) {
				Window.out.color("white");
				Window.out.print(word.substring(0, 2), center - 100, 80);
				Window.out.color("red");
				Window.out.print(word.substring(2, 3), center, 80);
				Window.out.color("white");
				Window.out.print(word.substring(3), center + 50, 80);
				
			}
			//9-12
			else if (word.length() < 12) {
				Window.out.color("white");
				Window.out.print(word.substring(0, 3), center - 200, 80);
				Window.out.color("red");
				Window.out.print(word.substring(3, 4), center, 80);
				Window.out.color("white");
				Window.out.print(word.substring(4), center + 50, 80);
				
			}
			
			else {
					Window.out.color("white");
					Window.out.print(word.substring(0, 4), center - 200, 80);
					Window.out.color("red");
					Window.out.print(word.substring(4, 5), center, 80);
					Window.out.color("white");
					Window.out.print(word.substring(5), center + 50, 80);
			}
			
			Window.frame(word.length()*30);
			
			System.out.println(word);
			
			start = end + 1;
			end = start + 1;
		}

	}

} 
