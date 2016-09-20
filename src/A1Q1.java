
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
        City Na = new City();
        Robot Steve = new Robot(Na, 3, 4, Direction. WEST); 
        
        // Create Walls
        new Wall (Na, 4, 3, Direction.NORTH);
        new Wall (Na, 4, 4, Direction. EAST);
        new Wall (Na, 4, 4, Direction. NORTH);
        new Wall (Na, 5, 4, Direction. EAST);
        new Wall (Na, 5, 4, Direction.SOUTH);
        new Wall (Na, 5, 3, Direction.SOUTH);
        new Wall (Na, 4, 3, Direction.WEST);
        new Wall (Na, 5, 3, Direction.WEST);
        // Get Steve to move
        Steve.move();
        Steve.move();
        Steve.turnLeft ();
        Steve.move();
        Steve.move();
        Steve.move();
        Steve.turnLeft();
        Steve.move();
        Steve.move();
        Steve.move();
        Steve.turnLeft();
        Steve.move();
        Steve.move();
        Steve.move();
        
    }
}
