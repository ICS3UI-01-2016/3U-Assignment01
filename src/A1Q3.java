
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
        City Jk = new City();
        Robot Bob = new Robot(Jk, 3, 1, Direction. EAST);
        
        //Create Walls
        new Wall (Jk, 3, 3,Direction.WEST);
        new Wall (Jk, 3, 3, Direction.NORTH);
        new Wall (Jk, 2, 4, Direction.WEST);
        new Wall (Jk, 1, 4, Direction.WEST);
        new Wall (Jk, 1, 4, Direction.NORTH);
        new Wall (Jk, 1, 4, Direction.EAST);
        new Wall (Jk, 2, 5, Direction.NORTH);
        new Wall (Jk, 2, 5, Direction.EAST);
        new Wall (Jk, 3, 5,Direction.EAST);
        new Thing(Jk,3,2);
        // Get Bob to move
        Bob.move();
        Bob.pickThing();
        Bob.turnLeft();
        Bob.move();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.move();
        Bob.turnLeft();
        Bob.move();
        Bob.move();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.move();
        Bob.putThing();
        Bob.move();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.move();
        Bob.turnLeft();
        Bob.move();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.move();
        Bob.move();
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
}
