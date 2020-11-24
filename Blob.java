package blobs;

import java.util.ArrayList;

import apcs.Window;

public class Blob {

	public static void main(String[] args) {
		ArrayList <Blob> blobs = new ArrayList <Blob> ();
		
		//infinitely draw frames
		while (true) {
			Window.frame();
			Window.out.background("white");
			
			//click mouse, add new blob
			if (Window.mouse.clicked()) {
				blobs.add(new Blob());
			}
			
			for (int i = 0 ; i < blobs.size(); i++) {
				Blob b = blobs.get(i);
				b.act();
			}
		}
	}
	
	int x;
	int y;
	int radius;
	
	public Blob() {
		x = Window.mouse.getX();
		y = Window.mouse.getY();
	}

	private void act() {
		Window.out.color(x, y, radius);
		//Window.out.circle(x, y, radius);
		//radius = radius + 5;
				
		//x = x + 5;
		//Window.out.randomColor();
		Window.out.polygon(
			x + Window.random(-10, 10), y + Window.random(-10, 10),
			x + Window.random(-10, 10), y + Window.random(-10, 10),
			x + Window.random(-10, 10), y + Window.random(-10, 10),
			x + Window.random(-10, 10), y + Window.random(-10, 10),
			x + Window.random(-10, 10), y + Window.random(-10, 10)
			);
		
	}

}
