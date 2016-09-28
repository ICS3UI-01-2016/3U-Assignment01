
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
 * @author slatz8075
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create a city for the robot
        City A1Q5 = new City();
        //Create the Robots
        Robot M = new Robot(A1Q5,0,1,Direction.WEST);
        Robot K = new Robot(A1Q5,3,3,Direction.EAST);
        //Create 
        new Wall(A1Q5,3,3,Direction.EAST);
        new Wall(A1Q5,3,3,Direction.SOUTH);
        new Wall(A1Q5,2,3,Direction.WEST);
        new Wall(A1Q5,2,3,Direction.EAST);
        new Wall(A1Q5,2,3,Direction.NORTH);
        
        new Thing(A1Q5,0,0);
        new Thing(A1Q5,1,0);
        new Thing(A1Q5,1,1);
        new Thing(A1Q5,1,2);
        new Thing(A1Q5,2,2);
       
        M.move();
        M.pickThing();
        M.turnLeft();
        M.move();
        M.pickThing();
        M.turnLeft();
        M.move();
        M.pickThing();
        
        K.turnLeft();
        K.turnLeft();
        K.move();
        K.turnLeft();
        K.turnLeft();
        K.turnLeft();
        K.move();
        K.pickThing();
        K.move();
        K.pickThing();
        K.turnLeft();
    }
}
