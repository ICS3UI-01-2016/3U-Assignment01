
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
         City a1q4 = new City();
        // Create robots
         Robot bob = new Robot(a1q4,0,0,Direction.SOUTH);
         Robot obo = new Robot(a1q4,0,1,Direction.SOUTH);
        // create wall 
         new Wall(a1q4,0,1,Direction.WEST);
         new Wall(a1q4,1,1,Direction.WEST);
         new Wall(a1q4,1,1,Direction.SOUTH);
        // movements
         bob.move();
         obo.move();
         obo.turnLeft();
         obo.move();
         obo.turnLeft();
         obo.turnLeft();
         obo.turnLeft();
         bob.move();
         obo.move();
         obo.turnLeft();
         obo.turnLeft();
         obo.turnLeft();
         bob.turnLeft();
         bob.move();
         obo.move();
         
    }
}
