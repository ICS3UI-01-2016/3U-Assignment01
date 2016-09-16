
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
public class A1_q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //created integers
        int moves = 0;
        
        //create a city for the robot
        City kw = new City();
        
        //create a robot facing east
        Robot Hans = new Robot(kw,1,2,Direction.SOUTH);
        
        // create walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,1,2,Direction.SOUTH);
        new Wall(kw,2,1,Direction.SOUTH);
        new Thing(kw,2,2);
       
        //robot movement
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.move();
        Hans.turnLeft();
        Hans.move();
        Hans.turnLeft();
        Hans.move();
        Hans.pickThing();
        Hans.turnLeft();
        Hans.turnLeft();
        while(moves < 3){
        Hans.move();
        Hans.turnLeft();
        Hans.turnLeft();
        Hans.turnLeft();
        moves = moves + 1;
        }
    }
}
