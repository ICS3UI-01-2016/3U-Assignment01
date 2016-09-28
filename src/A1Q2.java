
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
 * @author katop7929
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a city 
        City kpl = new City (); 
        
        // create a robot
        Robot obama = new Robot (kpl,1,2,Direction.SOUTH);
        
          //create a wall
        new Wall(kpl,1,2,Direction.EAST);  
        new Wall(kpl,1,2,Direction.NORTH);
        new Wall(kpl,1,1,Direction.NORTH);
        new Wall(kpl,1,1,Direction.WEST); 
        new Wall(kpl,2,1,Direction.WEST);
        new Wall(kpl,2,1,Direction.SOUTH);
        new Wall(kpl,1,2,Direction.SOUTH);
        
        //Make thing
        new Thing(kpl,2,2); 
        
        //get obama to move 
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.move();
        
        //get obama to pick up thing
        obama.pickThing(); 
        
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        
        
        
        
       
        
        
    }
}
