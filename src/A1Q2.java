
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
 * @author macdt8987
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new city for Robot
        City zzz = new City();
        // Create a new Robot
                Robot AFQUEEN = new Robot(zzz,1,2,Direction.SOUTH);
                new Wall (zzz,1,2,Direction.NORTH);
                new Wall (zzz,1,2,Direction.EAST);
                new Wall (zzz,1,2,Direction.SOUTH);
                new Wall (zzz,1,1,Direction.NORTH);
                new Wall (zzz,1,1,Direction.WEST);
                new Wall (zzz,2,1,Direction.WEST);
                new Wall (zzz,2,1,Direction.SOUTH);
                new Thing (zzz,2,2);
                // Move Robot
              
               
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.move();
                AFQUEEN.turnLeft();
                AFQUEEN.move();
                AFQUEEN.turnLeft();
                AFQUEEN.move();
                AFQUEEN.pickThing();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.move();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.move();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.move();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                AFQUEEN.turnLeft();
                
                
                
                
                
  
                
                
    }
}
