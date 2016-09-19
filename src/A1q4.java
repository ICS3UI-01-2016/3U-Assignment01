
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
 * @author lawd8918
 */
public class A1q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Make City
        City ktown = new City();
        
    //Make Walls
        new Wall(ktown,0,1,Direction.WEST);
        new Wall(ktown,1,1,Direction.WEST);
        new Wall(ktown,1,1,Direction.SOUTH);
        
    //Make robots
        Robot Dave = new Robot(ktown,0,0,Direction.SOUTH);
        Robot Joe = new Robot(ktown,0,1,Direction.SOUTH);
        
    //Make Robots move
        Joe.move();
        Joe.turnLeft();
        Dave.move();
        Joe.move();
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.move();
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.turnLeft();
        Dave.move();
        Dave.turnLeft();
        Joe.move();
        Dave.move();
        
    }
}
