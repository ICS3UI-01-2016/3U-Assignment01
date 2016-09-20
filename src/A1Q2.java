
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
        City Ka = new City();
        Robot Kathy = new Robot (Ka, 3, 2, Direction. WEST);
        
        //Create Walls
        new Wall (Ka, 3, 2, Direction. EAST);
        new Thing(Ka, 4, 2, Direction.EAST);
        new Wall (Ka, 3, 2, Direction. NORTH);
        new Wall (Ka, 3, 2, Direction.SOUTH);
        new Wall (Ka, 3, 1, Direction.NORTH);
        new Wall (Ka, 3, 1, Direction.WEST);
        new Wall (Ka, 4, 1, Direction.WEST);
        new Wall (Ka, 4, 1, Direction.SOUTH);
        
        // Get Kathy to move
        Kathy.move();
        Kathy.turnLeft();
        Kathy.move();
        Kathy.turnLeft();
        Kathy.move();
        Kathy.pickThing();
        Kathy.turnLeft();
        Kathy.turnLeft();
        Kathy.move();
        Kathy.turnLeft();
        Kathy.turnLeft();
        Kathy.turnLeft();
        Kathy.move();
        Kathy.turnLeft();
        Kathy.turnLeft();
        Kathy.turnLeft();
        Kathy.move();
        Kathy.turnLeft();
        Kathy.turnLeft();
        
        
        
        
        

        
        
        
        
        
         
    }
}
