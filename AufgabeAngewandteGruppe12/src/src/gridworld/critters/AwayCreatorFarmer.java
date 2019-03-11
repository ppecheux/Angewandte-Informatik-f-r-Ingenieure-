package gridworld.critters;

import java.util.ArrayList;

import gridworld.animals.Calf;
import gridworld.animals.Cow;
import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Animal;
import gridworld.framework.actor.Critter;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

/*the AwayCreatorFarmer creates a Calf when he is too far from Animals
 * 
 * */
public class AwayCreatorFarmer extends CreatorFarmer {
	
	private int distanceFromClosestCow=3;
	
	@Override
	public void processActors(ArrayList<Actor> actors)
    {
        if (getNumber(actors)==0){
        	Grid<Actor> gr = getGrid();
            if (gr == null)
                return;
            Location loc = getLocation();
            Location next = loc.getAdjacentLocation(getDirection());
            System.out.println("we move");
            if (gr.isValid(next)&&gr.get(next)==null){
                moveTo(next);
                System.out.println("we move");
                //creation of the Calf
	            Calf neu= new Calf();
	            neu.setAge(0);
	            neu.putSelfInGrid(gr, loc);
            	}
            else
                //removeSelfFromGrid();
            	this.setDirection(getDirection()+45);
        }
    }
	
	//@Override
	protected int getNumber(ArrayList<Actor> actors){
		int CowNumber=1;
		Grid<Actor> gr = getGrid();
		Actor ac;
		for(Location l:gr.getOccupiedLocations()){
			ac=gr.get(l);
			if (ac instanceof Animal&&this.getDistance(ac)<distanceFromClosestCow*Math.sqrt(2)){
                return 0;
            }
		}
		return CowNumber;
	}
	

}
