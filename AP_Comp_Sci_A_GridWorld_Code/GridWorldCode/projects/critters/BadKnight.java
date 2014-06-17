import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;
/** 
*@Finnegan Carroll, Asher Charleston, Matt Erter.
*@since 6/17/14
*@version beta 
* Bad knight is a knight that is colored black and attacks other knights that
* are not also bad knights.
*/
public class BadKnight extends Knight{
   // constructer for black knight *makes a black knight*  
   public BadKnight(){
      setColor(Color.BLACK);
   }
   // calls the act of the knight. 
   public void act(){
      super.act();
   }
   // finds the actors around it, for every actor, if its a bad knight nothing happens,
   // but if it's eny other critter it will fight with it, producing a random victor.  
   public void processActors(ArrayList<Actor> actors)
     {
         for (Actor a : actors)
         {
             if ( ((a instanceof Critter && !(a instanceof BadKnight)))){
                 a.removeSelfFromGrid();
             }
         }
     
     }
   }
