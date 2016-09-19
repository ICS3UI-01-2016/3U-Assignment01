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
 * @author wangk9757
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Create a city
     City ye = new City(); 
     
     //create a robot
     Robot Beshoy = new Robot (ye,2,2,Direction.SOUTH);
     //create a robot 
     Robot Fam = new Robot (ye,2,3,Direction.SOUTH ); 
     //create walls 
     new Wall (ye,2,3,Direction.WEST);
     new Wall (ye,3,3,Direction.WEST);
     new Wall (ye,3,3,Direction.SOUTH);
     //get robots to move 
     Fam.move();
     Beshoy.move();
     Fam.turnLeft();
     Fam.move();
     Beshoy.move();
      Fam.turnLeft();
       Fam.turnLeft();
        Fam.turnLeft();
        Fam.move();
        Beshoy.turnLeft();
       
         Fam.turnLeft();
          Fam.turnLeft();
           Fam.turnLeft();
        Beshoy.move();
        Fam.move();
    }
}
