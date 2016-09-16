
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**16/09/2016
 * A1Q3
 * Get robot to climb a "mountain"
 * @author micla1676
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a city for the robot
        City theoutdoors = new City ();
        
        //create a robot
        Robot mountainbot = new Robot (theoutdoors,3,0,Direction.EAST);
        
       //create thing, "flag"
        new Thing (theoutdoors,3,1);
        
        //create walls in the city, a.k.a. "Mountain"
        
        new Wall(theoutdoors,3,2,Direction.WEST);
        new Wall(theoutdoors,3,2,Direction.NORTH);
        new Wall(theoutdoors,2,3,Direction.WEST);
        new Wall(theoutdoors,1,3,Direction.WEST);
        new Wall(theoutdoors,1,3,Direction.NORTH);
        new Wall(theoutdoors,1,3,Direction.EAST);
        new Wall(theoutdoors,2,4,Direction.NORTH);
        new Wall(theoutdoors,2,4,Direction.EAST);
        new Wall(theoutdoors,3,4,Direction.EAST);
        
        //get mountainbot to pick up the thing
        mountainbot.move();
        mountainbot.pickThing();
        
        //get mountainbot to climb to the peak of mountain
        
        mountainbot.turnLeft();
        mountainbot.move();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.move();
        mountainbot.turnLeft();
        mountainbot.move();
        mountainbot.move();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.move();
        
        //get mountainbot to drop "flag"
        
        mountainbot.putThing();
        
        //get mountainbot to climb down the mountain
        
        mountainbot.move();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.move();
        mountainbot.turnLeft();
        mountainbot.move();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.turnLeft();
        mountainbot.move();
        mountainbot.move();
        mountainbot.turnLeft(); 
        
    }
}
