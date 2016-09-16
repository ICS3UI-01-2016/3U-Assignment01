
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messr2578
 */
public class A1_q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //created integers
        int moves = 0;
        
        //create a city for the robot
        City kw = new City();
        
        //create a robot facing east
        Robot Hans = new Robot(kw,3,0,Direction.EAST);
        
        // create walls
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,1,3,Direction.WEST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        new Thing(kw,3,1);
        
        //move the robot
        Hans.move();
        Hans.pickThing();
        Hans.turnLeft();
        Hans.move();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.move();
        Hans.turnLeft();
        Hans.move();
        Hans.move();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.move();
        Hans.putThing();
        Hans.move();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.move();
        Hans.turnLeft();
        Hans.move();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.move();
        Hans.move();
        Hans.turnLeft();
    }
}
