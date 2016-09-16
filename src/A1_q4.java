
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
 * @author messr2578
 */
public class A1_q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //created integers
        int moves = 0;
        
        //create a city for the robot
        City kw = new City();
        
        //create a robot facing east
        Robot Hans = new Robot(kw,0,0,Direction.EAST);
        Robot Joe = new Robot(kw,0,1,Direction.WEST);
        // create walls
        new Wall(kw,0,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        new Wall(kw,1,1,Direction.WEST);
        
        //Alternate movement between the two robots
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.turnLeft();
        Joe.turnLeft();
        Joe.move();
        Hans.move();
        Joe.turnLeft();
        Joe.move();
        Hans.move();
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.move();
        Hans.turnLeft();
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.turnLeft();
        Hans.move();
        Joe.move();

    }
    
}
