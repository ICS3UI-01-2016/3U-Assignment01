
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
 * @author manok5757
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a city
        City km = new City();
        //create walls
        new Wall (km,0,1,Direction.WEST);
        new Wall (km,1,1,Direction.WEST);
        new Wall (km,1,1,Direction.SOUTH);
        //create a robot
        Robot karel = new Robot (km,0,0,Direction.SOUTH);
        //create another robot
        Robot cliff = new Robot (km,0,1,Direction.SOUTH);
        //make robot karel arrive at destination
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        //make robot cliff arive at destination
        cliff.move();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.turnLeft();
        cliff.move();
        
        
        
    }
}
