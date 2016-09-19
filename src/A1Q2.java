
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
 * @author wangk9757
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Create a city
     City ye = new City(); 
     
     //create a robot
     Robot Beshoy = new Robot (ye,1,2,Direction.WEST);
 //create walls 
     new Wall (ye,1,1,Direction.NORTH);
     new Wall (ye,1,2,Direction.NORTH);
     new Wall (ye,1,2,Direction.EAST); 
     new Wall (ye,2,1,Direction.WEST);
     new Wall (ye,1,1,Direction.WEST);
     new Wall (ye,2,1,Direction.SOUTH);
     new Wall (ye,1,2,Direction.SOUTH);
 //create thing
     new Thing (ye,2,2); 
// get Beshoy to move
     Beshoy.move();
     Beshoy.turnLeft();
     Beshoy.move();
     Beshoy.turnLeft();
     Beshoy.move();
     Beshoy.pickThing();
     Beshoy.turnLeft();
     Beshoy.turnLeft();
     Beshoy.move();
     
     Beshoy.turnLeft();
     Beshoy.turnLeft();
     Beshoy.turnLeft();
     Beshoy.move();
     Beshoy.turnLeft();
     Beshoy.turnLeft();
     Beshoy.turnLeft();
      Beshoy.move();
      Beshoy.turnLeft();
     Beshoy.turnLeft();
     Beshoy.turnLeft();
    
    
     
    
     
     
     
     

    }
}