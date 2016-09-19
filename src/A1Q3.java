
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Create a city
     City ye = new City(); 
     
     //create a robot
     Robot Beshoy = new Robot (ye,2,-1,Direction.EAST);
 //create walls 
     new Wall (ye,1,2,Direction.WEST);
    
     new Wall (ye,1,3,Direction.EAST); 
     new Wall (ye,2,1,Direction.WEST);
     new Wall (ye,2,1,Direction.NORTH);
     new Wall (ye,2,1,Direction.SOUTH);
     new Wall (ye,2,2,Direction.SOUTH);
     new Wall (ye,2,3,Direction.SOUTH);
     new Wall (ye,2,3,Direction.EAST); 
     new Wall (ye,0,2,Direction.WEST);
     new Wall (ye,0,2,Direction.NORTH);
     new Wall (ye,0,2,Direction.EAST);
     new Wall (ye,1,3,Direction.NORTH);
     
     
 //create thing
     new Thing (ye,2,0); 
// get Beshoy to move
     Beshoy.move();
      Beshoy.pickThing();
      Beshoy.turnLeft();
      Beshoy.move();
      Beshoy.turnLeft();
      Beshoy.turnLeft();
      Beshoy.turnLeft();
      Beshoy.move();
      Beshoy.turnLeft();
     Beshoy.move();
       Beshoy.move();
      Beshoy.turnLeft();
       Beshoy.turnLeft();
       Beshoy.turnLeft();
       
       Beshoy.move();
      Beshoy.putThing();
       Beshoy.move();
      Beshoy.turnLeft();
      Beshoy.turnLeft();
      Beshoy.turnLeft();
      Beshoy.move();
      Beshoy.turnLeft();
      Beshoy.move();
      Beshoy.turnLeft();
      Beshoy.turnLeft();
      Beshoy.turnLeft();
      Beshoy.move();
      Beshoy.move();
      Beshoy.turnLeft();
      Beshoy.move();
      Beshoy.move();
      Beshoy.move();
      
      
      
      
     
    
     
    
     
     
     
     

    }
}
