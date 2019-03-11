package gridworld.critters;

import gridworld.animals.Cow;
import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.actor.MilkTank;

import java.util.ArrayList;

public class MilkFarmer extends Farmer {
	
	MilkTank myMilkTank;
	
	//sollen wir ein spezielles konstruktor hier haben um my milktank zu ersetzen?
	
	
	@Override
	   public void processActors(ArrayList<Actor> actors)
	    {
	        for (Actor a : actors)
	        {
	            if (a instanceof Flower){
	                a.removeSelfFromGrid();
	            }
	            if (a instanceof Cow){
	            	++this.myMilkTank.MilkMenge;
	            	a.removeSelfFromGrid();
	            }
	            
	        }
	    }

}
