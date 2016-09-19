
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City aaa = new City();
        
       // Create the Robots
        Robot Maria = new Robot(aaa,0,1,Direction.WEST);
        Robot Karl = new Robot(aaa,3,3,Direction.EAST);
        // Make walls
        new Wall(aaa,2,3,Direction.NORTH);
        new Wall(aaa,2,3,Direction.EAST);
        new Wall(aaa,2,3,Direction.WEST);
        new Wall(aaa,3,3,Direction.SOUTH);
        new Wall(aaa,3,3,Direction.EAST);
        // Create the things
        new Thing(aaa,0,0);
        new Thing(aaa,1,0);
        new Thing(aaa,1,1);
        new Thing(aaa,1,2);
        new Thing(aaa,2,2);
        //Make them move
        Karl.turnLeft();
        Karl.turnLeft();
        Karl.move();
        Karl.turnLeft();
        Karl.turnLeft();
        Karl.turnLeft();
        Maria.move();
        Maria.pickThing();
        Karl.move();
        Karl.pickThing();
        Maria.turnLeft();
        Karl.move();
        Karl.pickThing();
        Maria.move();
        Maria.pickThing();
        Karl.turnLeft();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();
        
        
        
        
        
        
    }
}
