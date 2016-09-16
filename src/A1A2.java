
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
public class A1A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
         City a1q2 = new City();
        // Create a robot
         Robot bob = new Robot(a1q2,1,2,Direction.SOUTH);
        // create thing
         Thing t;  
            t = new Thing(a1q2,2,2);
            t.setColor(Color.cyan);
        // create wall
         new Wall(a1q2,1,2,Direction.SOUTH);
         new Wall(a1q2,1,2,Direction.EAST);
         new Wall(a1q2,1,2,Direction.NORTH);
         new Wall(a1q2,1,1,Direction.NORTH);
         new Wall(a1q2,1,1,Direction.WEST);
         new Wall(a1q2,2,1,Direction.WEST);
         new Wall(a1q2,2,1,Direction.SOUTH);
         // get newspaper
          bob.turnLeft(); 
          bob.turnLeft();
          bob.turnLeft();
          bob.move();
          bob.turnLeft();
          bob.move();
          bob.turnLeft();
          bob.move(); 
          bob.pickThing();
          bob.turnLeft();
          bob.turnLeft();
          bob.move();
          bob.turnLeft();
          bob.turnLeft();
          bob.turnLeft();
          bob.move();
          bob.turnLeft();
          bob.turnLeft();
          bob.turnLeft();
          bob.move();
          bob.putThing();
          bob.turnLeft();
          bob.turnLeft();
          bob.turnLeft();
         
         
    }
}
