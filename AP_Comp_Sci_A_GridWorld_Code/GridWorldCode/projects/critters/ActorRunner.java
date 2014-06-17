/** 
*@author Finnegan Carroll, Asher Charleston, Matt Erter.
*@since 6/17/14
*@version beta 
* This is the main class that allows you to add
* knights to a grid. allso allows you to change the size of the grid
* and the number and type of knights that you would like.
*/
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import java.awt.Color;
      
 public class ActorRunner{
       
    public static void main(String[] args)
     {  
         // this allows you to change the size of the grid. 
         
         Grid<Actor> grid = new BoundedGrid<Actor>(4,4);
         ActorWorld world = new ActorWorld(grid);        
         world.show();
         
         // adds eny types of knights you would like, wether its neutral, a good knight, or a bad knight.
          
         world.add(new Location(2,1), new GoodKnight());       
         world.add(new Location(1,2), new BadKnight()); 
     } 
}      