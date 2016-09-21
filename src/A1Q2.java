
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
 * @author dhimm3399
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a city of the robot
      City On = new City();
      
      // create a arobot 
       Robot Emma = new Robot (On,2,9,Direction.SOUTH);
       
        //create walls 
        new Wall(On,2,9,Direction.SOUTH); 
      new Wall(On,2,9,Direction.WEST); 
      new Wall(On,2,9,Direction.NORTH);
      new Wall(On,2,10,Direction.SOUTH);
      new Wall(On,2,10,Direction.EAST);
      new Wall(On,1,10,Direction.EAST);
      new Thing(On,1,9); 
      
     Emma.turnLeft();
     Emma.move();
     Emma.turnLeft();
     Emma.move();
     Emma.turnLeft();
     Emma.move();
     Emma.pickThing();
     Emma.turnLeft();
     Emma.turnLeft();
     Emma.move();
     Emma.turnLeft();
     Emma.turnLeft();
     Emma.turnLeft();
     Emma.move();
     Emma.turnLeft();
     Emma.turnLeft();
     Emma.turnLeft();
     Emma.move();
     Emma.turnLeft();
     Emma.turnLeft();
     Emma.turnLeft();
     
      
      
    }
    
    
}
