
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
 * @author gavra1870
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a City for robot
        City jk = new City();
        Robot bob = new Robot(jk, 3, 1, Direction. EAST);
        
        //Create Walls
        new Wall (jk, 3, 3,Direction.WEST);
        new Wall (jk, 3, 3, Direction.NORTH);
        new Wall (jk, 2, 4, Direction.WEST);
        new Wall (jk, 1, 4, Direction.WEST);
        new Wall (jk, 1, 4, Direction.NORTH);
        new Wall (jk, 1, 4, Direction.EAST);
        new Wall (jk, 2, 5, Direction.NORTH);
        new Wall (jk, 2, 5, Direction.EAST);
        new Wall (jk, 3, 5,Direction.EAST);
        new Thing(jk,3,2);
        // Get bob to move and pick thing up.
        bob.move();
        bob.pickThing();
        // Get bob to move around the corners in order to get to the top.
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        // Get to bob to drop Thing.
        bob.putThing();
        //Get bob to move down around the two corners to get the bottom.
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
}
