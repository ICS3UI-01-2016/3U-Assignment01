
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for robot
        City ka = new City();
        Robot kathy = new Robot (ka, 3, 2, Direction. WEST);
        
        //Create Walls
        new Wall (ka, 3, 2, Direction. EAST);
        new Thing(ka, 4, 2, Direction.EAST);
        new Wall (ka, 3, 2, Direction. NORTH);
        new Wall (ka, 3, 2, Direction.SOUTH);
        new Wall (ka, 3, 1, Direction.NORTH);
        new Wall (ka, 3, 1, Direction.WEST);
        new Wall (ka, 4, 1, Direction.WEST);
        new Wall (ka, 4, 1, Direction.SOUTH);
        
        // Get the robot kathy to turn left, around the wall and move towards the thing
        kathy.move();
        kathy.turnLeft();
        kathy.move();
        kathy.turnLeft();
        kathy.move();
        //Get kathy to pick up thing and picked up turn around. 
        kathy.pickThing();
        kathy.turnLeft();
        kathy.turnLeft();
        // Get kathy move and turn right around the wall 
        kathy.move();
        kathy.turnLeft();
        kathy.turnLeft();
        kathy.turnLeft();
        // Get kathy move and turn right towards the starting point
        kathy.move();
        kathy.turnLeft();
        kathy.turnLeft();
        kathy.turnLeft();
        // get kathy to move back into the starting point and turn around in order to be in the exact postion he started in.
        kathy.move();
        kathy.turnLeft();
        kathy.turnLeft();
        
        
        
        
        

        
        
        
        
        
         
    }
}
