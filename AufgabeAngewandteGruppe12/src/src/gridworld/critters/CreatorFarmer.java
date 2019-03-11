package gridworld.critters;

import java.util.ArrayList;

import gridworld.animals.Calf;
import gridworld.animals.Cow;
import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Animal;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CreatorFarmer extends Farmer {
	
	@Override
	   public void processActors(ArrayList<Actor> actors)
	    {
	        if (getCowNumber(actors)==0){
	        	Grid<Actor> gr = getGrid();
	            if (gr == null)
	                return;
	            Location loc = getLocation();
	            Location next = loc.getAdjacentLocation(getDirection());
	            if (gr.isValid(next)&&gr.get(next)==null){
	                moveTo(next);
	                //creation of the Calf
		            Calf neu= new Calf();
		            neu.setAge(0);
		            neu.putSelfInGrid(gr, loc);
	            	}
	            else
	            	this.setDirection(getDirection()+45);
	        }
	    }
	
	protected int getCowNumber(ArrayList<Actor> actors){
		int CowNumber=0;
		Grid<Actor> gr = getGrid();
		Actor ac;
		for(Location l:gr.getOccupiedLocations()){
			ac=gr.get(l);
			if (ac instanceof Animal){
                ++CowNumber;
            }
		}

		return CowNumber;
	}

}
