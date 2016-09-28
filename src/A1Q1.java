
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
 * @author katop7929
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City kpl = new City (); 
        
        // create a robot
        Robot obama = new Robot (kpl,0,2,Direction.WEST);
         
        //create a wall
        new Wall(kpl,1,2,Direction.EAST); 
        new Wall(kpl,2,2,Direction.EAST); 
        new Wall(kpl,1,2,Direction.NORTH);
        new Wall(kpl,1,1,Direction.NORTH);
        new Wall(kpl,1,1,Direction.WEST); 
        new Wall(kpl,2,1,Direction.WEST);
        new Wall(kpl,2,1,Direction.SOUTH);
        new Wall(kpl,2,2,Direction.SOUTH);
        
        //get obama to move 
        obama.move(); 
        obama.move(); 
        obama.turnLeft();
        obama.move();
        obama.move();
        obama.move();
        obama.turnLeft();
        obama.move();
        obama.move();
        obama.move();
        obama.turnLeft();
        obama.move();
        obama.move();
        obama.move();
        obama.turnLeft();
        obama.move();
    }
}
