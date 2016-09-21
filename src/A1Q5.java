
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create a city of the robot
        City On = new City();
        
        //create a robot
        Robot Megan = new Robot(On,0,1,Direction.WEST);
        Robot Emily = new Robot (On,3,3,Direction.EAST);
        //create wall
        new Wall(On,3,3,Direction.EAST);
        new Wall(On,3,3,Direction.SOUTH);
        new Wall(On,2,3,Direction.EAST); 
        new Wall(On,2,3,Direction.NORTH);
        new Wall(On,2,3,Direction.WEST);
        new Thing(On,0,0); 
        new Thing(On,1,0);
        new Thing(On,1,1);
        new Thing(On,1,2);
        new Thing(On,2,2);
        
        Emily.turnLeft();
        Emily.turnLeft();
        Emily.move();
        Emily.turnLeft();
        Emily.turnLeft();
        Emily.turnLeft();
        Emily.move();
        Emily.pickThing();
        Emily.move();
        Emily.pickThing();
        Emily.turnLeft();
        Megan.move();
        Megan.pickThing();
        Megan.turnLeft();
        Megan.move();
        Megan.pickThing();
        Megan.turnLeft();
        Megan.move();
        Megan.pickThing();
        
        
        
    }
}
