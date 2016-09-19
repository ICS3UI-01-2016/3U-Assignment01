
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
public class Excersice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
         City a1q1 = new City();
        // Create a robot
         Robot bob = new Robot(a1q1,0,2,Direction.WEST);
        // Create 8 walls
         new Wall(a1q1,1,2,Direction.NORTH);
         new Wall(a1q1,1,1,Direction.NORTH);
         new Wall(a1q1,1,1,Direction.WEST);
         new Wall(a1q1,2,1,Direction.WEST);
         new Wall(a1q1,2,1,Direction.SOUTH);
         new Wall(a1q1,2,2,Direction.SOUTH);
         new Wall(a1q1,1,2,Direction.EAST);
         new Wall(a1q1,2,2,Direction.EAST);
        // Move robot
         bob.move();  
         bob.move();
         bob.turnLeft();
         bob.move();  
         bob.move();
         bob.move();  
         bob.turnLeft();
         bob.move();  
         bob.move();
         bob.move(); 
         bob.turnLeft();
         bob.move();  
         bob.move();
         bob.move();  
         bob.turnLeft();
         bob.move();



        

    }
}

