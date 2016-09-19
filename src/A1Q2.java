
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
 * @author tomlj9878
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
        City JT = new City();
        //Create robot
        Robot b = new Robot(JT,2,4,Direction.SOUTH);
        //Create walls
        new Wall(JT,2,3,Direction.NORTH);
        new Wall(JT,2,3,Direction.WEST);
        new Wall(JT,2,4,Direction.NORTH);
        new Wall(JT,2,4,Direction.EAST);
        new Wall(JT,3,4,Direction.NORTH);
        new Wall(JT,3,3,Direction.SOUTH);
        new Wall(JT,3,3,Direction.WEST);
        //Create Thing
        new Thing(JT,3,4,Direction.EAST);
        
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
        b.move();
        b.turnLeft();
        b.move();
        b.turnLeft();
        b.move();
        b.pickThing();
        b.turnLeft();
        b.turnLeft();
        b.move();
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
        b.move();
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
        b.move();
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
        
    }
}
