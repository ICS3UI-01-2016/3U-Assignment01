
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
 * @author slatz8075
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A1Q3 = new City();
        //Create a Robot
        Robot Jeff = new Robot(A1Q3,0,3,Direction.EAST);
        //Create 
        new Wall(A1Q3,3,2,Direction.WEST);
        new Wall(A1Q3,3,3,Direction.NORTH);
        new Wall(A1Q3,1,1,Direction.WEST);
        new Wall(A1Q3,2,1,Direction.WEST);
        new Wall(A1Q3,1,2,Direction.EAST);
        new Wall(A1Q3,2,1,Direction.SOUTH);
        new Wall(A1Q3,1,2,Direction.SOUTH);
    }
}
