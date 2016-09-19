
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tmister911
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City k = new City();
        Robot karel = new Robot(k,3,3,Direction.EAST);
        Robot maria  = new Robot (k,0,1,Direction.WEST);
        maria.setLabel("M");
        karel.setLabel("K");
      new Thing (k,0,0);
      new Thing (k,1,0);
      new Thing (k,1,1);
      new Thing (k,1,2);
      new Thing (k,2,2);
   Wall Wall = new Wall (k,2,3,Direction.EAST);
   new Wall (k,2,3,Direction.WEST);
   new Wall (k,2,3,Direction.NORTH);
   new Wall (k,3,3,Direction.EAST);
   new Wall (k,3,3,Direction.SOUTH);
   maria.move();
   maria.pickThing();
   maria.turnLeft();
   maria.move();
   maria.pickThing();
   maria.turnLeft();
   karel.turnLeft();
   karel.turnLeft();
   karel.move();
   karel.turnLeft();
   karel.turnLeft();
   karel.turnLeft();
  karel.move();
  karel.pickThing();
  karel.move();
  karel.pickThing();
  karel.turnLeft();
  maria.move();
  maria.pickThing();
 
   
   
        
        
    }
    
}
