package gridworld.critters;

import gridworld.framework.actor.Actor;

import java.util.ArrayList;

public class Jaeger extends Farmer {
	@Override
	   public void processActors(ArrayList<Actor> actors)
	    {
	        for (Actor a : actors)
	        {
	            if (a instanceof Werewolf){
	                a.removeSelfFromGrid();
	            }
	            
	        }
	    }

}
