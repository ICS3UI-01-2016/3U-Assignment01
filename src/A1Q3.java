
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
 * @author macdt8987
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City
        City ccc = new City();
        // Make A robot
        Robot qqq = new Robot(ccc,3,0,Direction.EAST);
        new Thing(ccc,3,1);
        // Make walls
        new Wall (ccc,3,2,Direction.WEST);
        new Wall (ccc,3,2,Direction.NORTH);
        new Wall (ccc,2,3,Direction.WEST);
        new Wall (ccc,1,3,Direction.EAST);
        new Wall (ccc,1,3,Direction.WEST);
        new Wall (ccc,1,3,Direction.NORTH);
        new Wall (ccc,2,4,Direction.NORTH);
        new Wall (ccc,2,4,Direction.EAST);
        new Wall (ccc,3,4,Direction.EAST);
        //make Robot Move
        qqq.move();
        qqq.pickThing();
        qqq.turnLeft();
        qqq.move();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.move();
        qqq.turnLeft();
        qqq.move();
        qqq.move();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.move();
        qqq.putThing();
        qqq.move();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.move();
        qqq.turnLeft();
        qqq.move();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.turnLeft();
        qqq.move();
        qqq.move();
        qqq.turnLeft();
        
        
        
    }
}
