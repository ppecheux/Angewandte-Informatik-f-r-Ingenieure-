package gridworld.boxAnimal;
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import java.awt.Color;

import gridworld.animals.Cow;
import gridworld.critters.AwayCreatorFarmer;
import gridworld.critters.CreatorFarmer;
import gridworld.critters.Farmer;
import gridworld.critters.MilkFarmer;
import gridworld.critters.Werewolf;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.Location;

/**
 * This class runs a world that contains box Animals. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxfarmRunner
{
    public static void main(String[] args)	
    {
        ActorWorld world = new ActorWorld();
        AwayCreatorFarmer alice = new AwayCreatorFarmer();
        Farmer didier = new Farmer();
//        alice.setColor(Color.ORANGE);
        CreatorFarmer Gabriel= new CreatorFarmer();
        Werewolf Sophie = new Werewolf();
        MilkFarmer Seb = new MilkFarmer();
        Seb.setColor(Color.magenta);
        world.add(new Location(5,3),Gabriel);
        world.add(new Location(4, 8), didier);
        world.add(new Location(7, 8), alice);
        world.add(new Location(15,15), Sophie);
        world.add(new Location(13,15), Seb);
        world.show();
    }
}