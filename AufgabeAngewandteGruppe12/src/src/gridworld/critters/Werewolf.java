package gridworld.critters;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class Werewolf extends Farmer {
	
	public int deathtoll = 0;
	
	@Override
	   public void processActors(ArrayList<Actor> actors)
	    {
		
	        for (Actor a : actors)
	        {
	            if (a instanceof Eatable){
	                a.removeSelfFromGrid();
	                deathtoll++;
	            }
	            if (deathtoll > 10) {
	            
	            	deathtoll = 0;
		            Jaeger neu =new Jaeger();
					Grid<Actor> gr = getGrid();
					Location loc = getLocation();
					Location adj = loc.getAdjacentLocation(getDirection());
					neu.putSelfInGrid(gr, adj);
	            }
	            
	        }
	    }
	
//	public void spwanJaeger() {
//	
//			Jaeger neu =new Jaeger();
//			Grid<Actor> gr = getGrid();
//			Location loc = getLocation();
//			Location adj = loc.getAdjacentLocation(getDirection());
//			neu.putSelfInGrid(gr, adj);
//		
//		
//		
//		
//	}
//	

}
