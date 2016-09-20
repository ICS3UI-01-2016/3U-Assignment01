
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
 * @author vandl4973
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City RI = new City();
         new Wall (RI,3,3,Direction.SOUTH);
         new Wall (RI,2,3,Direction.NORTH);
         new Wall (RI,2,3,Direction.EAST);
         new Wall (RI,3,3,Direction.EAST);
         new Wall (RI,2,3,Direction.WEST);
         new Thing(RI,0,0);
         new Thing(RI,1,0);
         new Thing(RI,1,1);
         new Thing(RI,1,2);
         new Thing(RI,2,2);
         Robot bob = new Robot(RI, 3, 3, Direction.EAST);
         Robot shelly = new Robot(RI,0,1, Direction.WEST);
         shelly.setLabel("s");
         bob.setLabel("b");
         shelly.move();
         shelly.turnLeft();
         shelly.pickThing();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.pickThing();
         bob.move();
         bob.pickThing();
         bob.turnLeft();
         shelly.move();
         shelly.turnLeft();
         shelly.pickThing();
         shelly.move();
         shelly.pickThing();
    }
}
