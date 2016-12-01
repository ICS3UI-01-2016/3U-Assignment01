
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot karel = new Robot(tdot,1,2,Direction.SOUTH);
         // create walls
        new Wall(tdot,1,2,Direction.NORTH);
        new Wall (tdot,1,1,Direction.NORTH);
        new Wall (tdot,1,1,Direction.WEST);
        new Wall (tdot,2,1,Direction.WEST);
        new Wall (tdot,2,1,Direction.SOUTH);
        new Wall (tdot,2,2,Direction.NORTH);
        new Wall(tdot,1,2,Direction.EAST);
        // create a thing
        new Thing (tdot,2,2);
        // get robot to move
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.turnLeft();
         karel.move();
         karel.turnLeft();
         karel.move();
         // get robot to pick up thing
         karel.pickThing();
         // get robot to go back to original position
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
        
    }
}
