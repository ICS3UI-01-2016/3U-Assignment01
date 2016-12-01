
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot karel = new Robot(tdot,3,3,Direction.EAST);
        Robot maria = new Robot(tdot,0,1,Direction.WEST);
         // Make Labels
         maria.setLabel("M");
         karel.setLabel("K");
        // create a thing's
         new Thing (tdot,0,0);
         new Thing (tdot,1,0);
         new Thing (tdot,1,1);
         new Thing (tdot,1,2);
         new Thing (tdot,2,2);
         // create walls
         new Wall (tdot,2,3,Direction.WEST);
         new Wall (tdot,2,3,Direction.NORTH);
         new Wall (tdot,2,3,Direction.EAST);
         new Wall (tdot,3,3,Direction.EAST);
         new Wall (tdot,3,3,Direction.SOUTH);
         // get maria to pick up thing's
         maria.move();
         maria.pickThing();
         maria.turnLeft();
         maria.move();
         maria.pickThing();
         maria.turnLeft();
         maria.move();
         maria.pickThing();
         // get karel to pick up thing's
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.pickThing();
         karel.move();
         karel.pickThing();
         karel.turnLeft();
    }
}
