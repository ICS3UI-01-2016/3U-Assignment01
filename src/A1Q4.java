
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a city 
        City kpl = new City (); 
        
        // create a robot
        Robot obama = new Robot(kpl,0,1,Direction.SOUTH);
        
        //create a robot 
        Robot trump = new Robot(kpl,0,0,Direction.SOUTH); 
        
        //create a wall 
        new Wall(kpl,0,1,Direction.WEST);
        new Wall(kpl,1,1,Direction.WEST);
        new Wall(kpl,1,1,Direction.SOUTH);
        
        //get both both robots to move 
        obama.move();
        trump.move();
        obama.turnLeft();
        trump.move();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        trump.turnLeft();
        trump.move();
        obama.move();
    }
}
