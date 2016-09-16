
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
 * @author baayl3669
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a city for robot
        City af = new City();
        // create a robot
        Robot Ram = new Robot(af,3,0,Direction.EAST);
        
        // create walls
        new Wall(af,3,2,Direction.WEST);
        new Wall(af,3,2,Direction.NORTH);
        new Wall(af,2,3,Direction.WEST);
        new Wall(af,1,3,Direction.WEST);
        new Wall(af,1,3,Direction.NORTH);
        new Wall(af,1,3,Direction.EAST);
        new Wall(af,2,4,Direction.NORTH);
        new Wall(af,2,4,Direction.EAST);
        
    }
}
