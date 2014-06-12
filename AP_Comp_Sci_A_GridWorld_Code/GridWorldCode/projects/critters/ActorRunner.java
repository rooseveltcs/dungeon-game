import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import java.awt.Color;
       
 public class ActorRunner{
       
    public static void main(String[] args)
     {  
         Grid<Actor> grid = new BoundedGrid<Actor>(10,10);
         ActorWorld world = new ActorWorld(grid);        
         world.show();
         world.add(new Location(5,5), new NewBugTest());    
     } 
}      