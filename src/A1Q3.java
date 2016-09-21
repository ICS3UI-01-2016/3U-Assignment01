
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          // create a city of the robot
      City On = new City();
      // create a robot 
      Robot Emily = new Robot (On,6,5,Direction.EAST);
      
      //create walls 
      
      new Wall(On,6,7,Direction.WEST);
      new Wall(On,6,7,Direction.NORTH);
      new Wall(On,5,8,Direction.WEST);
      new Wall(On,4,8,Direction.WEST);
      new Wall(On,4,8,Direction.NORTH);
      new Wall(On,5,9,Direction.EAST);
      new Wall(On,4,8,Direction.EAST);
      new Wall(On,5,9,Direction.NORTH);
      new Wall(On,6,9,Direction.EAST);
      new Thing(On,6,6);   
      
      Emily.move();
      Emily.pickThing();
      Emily.turnLeft();
      Emily.move();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.move();
      Emily.turnLeft();
      Emily.move();
      Emily.move();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.move();
      Emily.move();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.move();
      Emily.turnLeft();
      Emily.move();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.turnLeft();
      Emily.move();
      Emily.move();
      Emily.turnLeft();
      
      
        
    }
}
