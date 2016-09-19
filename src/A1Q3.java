
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Create a city
         City a1q3 = new City();
        // Create a robot
         Robot bob = new Robot(a1q3,3,0,Direction.EAST);
        // create thing
         Thing t;  
            t = new Thing(a1q3,3,1);
            t.setColor(Color.cyan);
        // create wall 
         new Wall(a1q3,3,2,Direction.WEST);
         new Wall(a1q3,3,2,Direction.NORTH);
         new Wall(a1q3,2,3,Direction.WEST);
         new Wall(a1q3,1,3,Direction.WEST);
         new Wall(a1q3,1,3,Direction.NORTH);
         new Wall(a1q3,1,3,Direction.EAST);
         new Wall(a1q3,2,4,Direction.NORTH);
         new Wall(a1q3,2,4,Direction.EAST);
         new Wall(a1q3,3,4,Direction.EAST);
         // movements
           bob.move();
           bob.pickThing();
           bob.turnLeft();
           bob.move();
           bob.turnLeft();
           bob.turnLeft();
           bob.turnLeft();
           bob.move();
           bob.turnLeft();
           bob.move();
           bob.move();
           bob.turnLeft();
           bob.turnLeft();
           bob.turnLeft();
           bob.move();
           bob.putThing();
           bob.move();
           bob.turnLeft();
           bob.turnLeft();
           bob.turnLeft();
           bob.move();
           bob.turnLeft();
           bob.move();
           bob.turnLeft();
           bob.turnLeft();
           bob.turnLeft();
           bob.move();
           bob.move();
           bob.turnLeft();
           
           
         
         
         
    }
}
