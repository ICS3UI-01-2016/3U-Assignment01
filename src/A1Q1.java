
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a city for the robot
        City tdot = new City();
        //  Create a robot
        Robot Lamont = new Robot(tdot,0,2,Direction.WEST);
        // create walls
        new Wall(tdot,1,2,Direction.NORTH);
        new Wall (tdot,1,1,Direction.NORTH);
        new Wall (tdot,1,1,Direction.WEST);
        new Wall (tdot,2,1,Direction.WEST);
        new Wall (tdot,2,1,Direction.SOUTH);
        new Wall (tdot,2,2,Direction.SOUTH);
        new Wall (tdot,2,2,Direction.EAST);
        new Wall(tdot,1,2,Direction.EAST);
        //Get robot to move
        Lamont.move(); 
        Lamont.move();
        Lamont.turnLeft();
        Lamont.move();
        Lamont.move(); 
        Lamont.move();
        Lamont.turnLeft();
        Lamont.move(); 
        Lamont.move();
        Lamont.move();
        Lamont.turnLeft();
        Lamont.move();
        Lamont.move(); 
        Lamont.move();
        Lamont.turnLeft();
    }
}
