
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city
        City Q3 = new City();
        
        // Add walls
        new Wall(Q3,3,2,Direction.WEST);
        new Wall(Q3,3,2,Direction.NORTH);
        new Wall(Q3,2,3,Direction.WEST);
        new Wall(Q3,1,3,Direction.WEST);
        new Wall(Q3,1,3,Direction.NORTH);
        new Wall(Q3,1,3,Direction.EAST);
        new Wall(Q3,2,4,Direction.NORTH);
        new Wall(Q3,2,4,Direction.EAST);
        new Wall(Q3,3,4,Direction.EAST);
        
        // Add flag
        Thing flag = new Thing(Q3,3,1);
        
        // Add robot
        RobotSE rick = new RobotSE(Q3,3,0,Direction.EAST);
        
        // Move robot
        rick.move();
        rick.pickThing();
        rick.turnLeft();
        rick.move();
        rick.turnRight();
        rick.move();
        rick.turnLeft();
        rick.move();
        rick.move();
        rick.turnRight();
        rick.move();
        rick.putThing();
        rick.move();
        rick.turnRight();
        rick.move();
        rick.turnLeft();
        rick.move();
        rick.turnRight();
        rick.move();
        rick.move();
        rick.turnLeft();
    }
}
