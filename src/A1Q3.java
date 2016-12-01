
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
 * @author islai1669
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot Lamont = new Robot(tdot,3,0,Direction.EAST);
        // create a thing
         new Thing (tdot,3,1);
        // create walls
        new Wall (tdot,3,2,Direction.WEST);
        new Wall (tdot,3,2,Direction.NORTH);
        new Wall (tdot,2,3,Direction.WEST);
        new Wall (tdot,1,3,Direction.WEST);
        new Wall (tdot,1,3,Direction.NORTH);
        new Wall (tdot,1,3,Direction.EAST);
        new Wall (tdot,2,4,Direction.NORTH);
        new Wall (tdot,2,4,Direction.EAST);
        new Wall (tdot,3,4,Direction.EAST);
        // get robot to move
        Lamont.move();
        // get robot to pick up thing
        Lamont.pickThing();
        // get robot to move
        Lamont.turnLeft();
        Lamont.move();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.move();
        Lamont.turnLeft();
        Lamont.move();
        Lamont.move();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.move();
        // get robot to drop thing
        Lamont.putThing();
        // get robot to move
        Lamont.move();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.move();
        Lamont.turnLeft();
        Lamont.move();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.turnLeft();
        Lamont.move();
        Lamont.move();
        Lamont.turnLeft();
        
    }
}
