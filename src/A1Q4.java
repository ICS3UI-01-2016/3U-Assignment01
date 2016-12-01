
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
 * @author islai1669
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot karel = new Robot(tdot,0,1,Direction.SOUTH);
        // Create a robot
        Robot Lamont = new Robot(tdot,0,0,Direction.SOUTH);
        // create wall
        new Wall (tdot,0,1,Direction.WEST);
        new Wall (tdot,1,1,Direction.WEST);
        new Wall (tdot,1,1,Direction.SOUTH);
        // Get robots to move
        Lamont.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        Lamont.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        Lamont.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        Lamont.move();
        karel.move();
      
        
    }
}
