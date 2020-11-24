package apcs;

public class Gravity {

	public static void main(String[] args) {
		Window.size(1000, 800);
		
		//Gravitation formula
		double G = 1;
		
		double p1x = 450;
		double p1y = 400;
		double p1dx = 0;
		double p1dy = 0;
		double p1mass = 10000;
		
		double p2x = 550;
		double p2y = 400;
		double p2dy = -10;
		double p2dx = 0;
		double p2mass = 100;
		
		//Infinitely draw frames
		while (true) {
			Window.frame();
			
			//Draw the two objects
			Window.out.color("yellow");
			Window.out.circle(p1x, p1y, 50);
			
			Window.out.color("blue");
			Window.out.circle(p2x, p2y, 15);
			
			//Calculate x and y difference
			double diffx = p1x - p2x;
			double diffy = p1y - p2y;
			
			//Calculate angle and distance
			double angle = Math.atan2(diffy, diffx);
			double distance = Math.sqrt(Math.pow(diffx, 2) + Math.pow(diffy, 2));
			double force = G * p1mass * p2mass / Math.pow(distance, 2);
			
			double forcex = force * Math.cos(angle);
			double forcey = force * Math.sin(angle);
			
			p1dx += -forcex / p1mass;
			p1dy += -forcey / p1mass;
			
			p2dx += forcex / p2mass;
			p2dy += forcey / p2mass;
			
			p1x += p1dx;
			p1y += p1dy;
			
			p2x += p2dx;
			p2y += p2dy;
					
		}
	}

}
