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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Create a city
     City ye = new City(); 
     
     //create a robot
     Robot maria = new Robot (ye,0,1,Direction.WEST);
     //create a robot 
     Robot karel = new Robot (ye,3,3,Direction.EAST ); 
     //create walls 
     new Wall (ye,2,3,Direction.WEST);
     new Wall (ye,2,3,Direction.NORTH);
     new Wall (ye,3,3,Direction.EAST);
     new Wall (ye,2,3,Direction.EAST);
     new Wall (ye,3,3,Direction.SOUTH);
     //create thing
     new Thing (ye,2,2);
     new Thing (ye,1,2);
     new Thing (ye,1,1);
     new Thing (ye,0,0);
     new Thing (ye,1,0);
     //label robots
     maria.setLabel("m");
     karel.setLabel("k");
     //get robots to move
     maria.move();
     maria.pickThing();
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     maria.turnLeft();
     maria.move();
     maria.pickThing();
     karel.turnLeft();karel.turnLeft();karel.turnLeft();
     karel.move();
     karel.pickThing();
     maria.turnLeft();
     maria.move();
     maria.pickThing();
     karel.move();
     karel.pickThing();
     karel.turnLeft();
    }
}