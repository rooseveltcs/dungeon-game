 import info.gridworld.grid.Location;
 import info.gridworld.actor.ActorWorld;
 import info.gridworld.actor.Critter;
 
 public class NewBugTestRunner {
 
    public static void main(String[] args)
     {
         ActorWorld world = new ActorWorld();        
         world.show();
         world.add(new Location(5, 5), new NewBugTest());
    }
}