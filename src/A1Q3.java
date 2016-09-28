
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // create a city 
        City kpl = new City (); 
        
        // create a robot
        Robot obama = new Robot(kpl,3,0,Direction.EAST);
        
        //create a Wall 
        new Wall(kpl,3,2,Direction.WEST); 
        new Wall(kpl,3,2,Direction.NORTH); 
        new Wall(kpl,2,3,Direction.WEST); 
        new Wall(kpl,1,3,Direction.WEST);
        new Wall(kpl,1,3,Direction.NORTH); 
        new Wall(kpl,1,3,Direction.EAST); 
        new Wall(kpl,2,4,Direction.NORTH);
        new Wall(kpl,2,4,Direction.EAST);
        new Wall(kpl,3,4,Direction.EAST);
        
        //Make Thing 
        new Thing(kpl,3,1); 
        
        //get obama to move 
        obama.move();
        
        //get obama to pick up thing 
        obama.pickThing();
        
        //get obama to move
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.move();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        
        //get obama o drop thing 
        obama.putThing();
        
        //get obama to move
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.move();
        obama.turnLeft();
        obama.turnLeft();
        obama.turnLeft();
        obama.move();
        obama.move();
        obama.turnLeft();      
    }
}
