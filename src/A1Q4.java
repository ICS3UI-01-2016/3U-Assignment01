
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
 * @author tomlj9878
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
        City JT = new City();
        //Create robot
        Robot d = new Robot(JT,0,0,Direction.SOUTH);
        Robot e = new Robot(JT,0,1,Direction.SOUTH);
        //Create walls
        new Wall(JT,0,1,Direction.WEST);
        new Wall(JT,1,1,Direction.WEST);
        new Wall(JT,1,1,Direction.SOUTH);
        
        d.move();
        d.move();
        d.turnLeft();
        d.move();
        
        e.move();
        e.turnLeft();
        e.move();
        e.turnLeft();
        e.turnLeft();
        e.turnLeft();
        e.move();
        e.turnLeft();
        e.turnLeft();
        e.turnLeft();
        e.move();
             
    }
}
