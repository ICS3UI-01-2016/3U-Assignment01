
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
 * @author dhimm3399
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //create a city of the robot
        City On = new City();
        
        //create a robot
        Robot Megan = new Robot (On,1,1,Direction.SOUTH);
        Robot Emily= new Robot (On,1,2,Direction.SOUTH);
        new Wall(On,1,2,Direction.WEST);
        new Wall(On,2,2,Direction.WEST);
        new Wall(On,2,2,Direction.SOUTH);
        
        Megan.move();
        Megan.move();
        Megan.turnLeft();
        Megan.move();
        Emily.move();
        Emily.turnLeft();
        Emily.move();
        Emily.turnLeft();
        Emily.turnLeft();
        Emily.turnLeft();
        Emily.move();
        Emily.turnLeft();
        Emily.turnLeft();
        Emily.turnLeft();
        Emily.move();
        
        
        
        
        
        
        
        
        
        
    }
}
