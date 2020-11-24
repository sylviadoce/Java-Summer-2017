package gridsearch;

import java.util.LinkedList;
import java.util.Queue;

public class MazeSolver {

	public static void main(String[] args) {
		World world = new World("sylviamaze");
		world.draw();
		
		Queue<Cell> cellList = new LinkedList<Cell>();
		Cell current = world.getStart();
		
		while(! current.equals(world.getEnd())) {
			for(Cell c : current.neighbors()) {
				if(! c.isMarked()) {
					c.mark();
					c.setPrevious(current);
					cellList.add(c);
				}
			}
			current = cellList.remove();
			world.draw();
		}
		
		current = current.getPrevious();
		while(! current.equals(world.getStart())) {
			current.markAsPath();
			current = current.getPrevious();
			world.draw();
		}
	}

}
