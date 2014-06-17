import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
/** 
*@Finnegan Carroll, Asher Charleston, Matt Erter.
*@since 6/17/14
*@version beta 
* knight is the base for both good and bad knights. they are neutral and therefore 
* attack everything. because it is neutral its color is null.
*/
public class Knight extends Critter{
   // neutral knights have no color classification. 
   public Knight(){
      setColor(null);
   }
   // acts as if its a critter. 
   public void act(){
      super.act();
   }
}
