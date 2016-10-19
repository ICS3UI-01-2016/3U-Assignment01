
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
 * @author gavra1870
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City for robot
        City na = new City();
        Robot steve = new Robot(na, 3, 4, Direction. WEST); 
        
        // Create Walls
        new Wall (na, 4, 3, Direction.NORTH);
        new Wall (na, 4, 4, Direction. EAST);
        new Wall (na, 4, 4, Direction. NORTH);
        new Wall (na, 5, 4, Direction. EAST);
        new Wall (na, 5, 4, Direction.SOUTH);
        new Wall (na, 5, 3, Direction.SOUTH);
        new Wall (na, 4, 3, Direction.WEST);
        new Wall (na, 5, 3, Direction.WEST);
        
        // move around the top left corner
        steve.move();
        steve.move();
        steve.turnLeft ();
        steve.move();
        
        //move around the bottom left corner
        steve.move();
        steve.move();
        steve.turnLeft();
        steve.move();
        //move around the bottom right corner 
        steve.move();
        steve.move();
        steve.turnLeft();
        steve.move();
        //move forward to get the robot to the same loctaion that it started in
        steve.move();
        steve.move();
        
    }
}
