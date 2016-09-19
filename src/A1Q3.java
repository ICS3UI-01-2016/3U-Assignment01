
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city for robot
        City JT = new City();
        //create robot
        Robot c = new Robot(JT,3,0,Direction.EAST);
        //Create walls
        new Wall(JT,3,2,Direction.WEST);
        new Wall(JT,3,2,Direction.NORTH);
        new Wall(JT,2,3,Direction.WEST);
        new Wall(JT,1,3,Direction.WEST);
        new Wall(JT,1,3,Direction.NORTH);
        new Wall(JT,1,3,Direction.EAST);
        new Wall(JT,2,4,Direction.NORTH);
        new Wall(JT,2,4,Direction.EAST);
        new Wall(JT,3,4,Direction.EAST);
        //Create Thing
        new Thing(JT,3,1,Direction.EAST);
        
        c.move();
        c.pickThing();
        c.turnLeft();
        c.move();
        c.turnLeft();
        c.turnLeft();
        c.turnLeft();
        c.move();
        c.turnLeft();
        c.move();
        c.move();
        c.turnLeft();
        c.turnLeft();
        c.turnLeft();
        c.move();
        c.putThing();
        c.move();
        c.turnLeft();
        c.turnLeft();
        c.turnLeft();
        c.move();
        c.turnLeft();
        c.move();
        c.turnLeft();
        c.turnLeft();
        c.turnLeft();
        c.move();
        c.move();
        c.turnLeft();
        
    }
}
