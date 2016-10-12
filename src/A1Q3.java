
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
 * @author khans4349
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City
        City Mountain = new City();
        
        // new Robot
        Robot Hiker = new Robot(Mountain,3,0,Direction.EAST);
        
        // Create a Wall
        new Wall(Mountain,3,2,Direction.WEST);
        new Wall(Mountain,3,2,Direction.NORTH);
        new Wall(Mountain,2,3,Direction.WEST);
        new Wall(Mountain,1,3,Direction.WEST);
        new Wall(Mountain,1,3,Direction.NORTH);
        new Wall(Mountain,1,3,Direction.EAST);
        new Wall(Mountain,2,4,Direction.NORTH);
        new Wall(Mountain,2,4,Direction.EAST);
        new Wall(Mountain,3,4,Direction.EAST);
        
        // create a thing
        new Thing(Mountain,3,1);
        
        // get robot to move
        Hiker.move();
        
        // pick thing
        Hiker.pickThing();
        
        //get robot to move
        Hiker.turnLeft();
        Hiker.move();
        
        Hiker.turnLeft();
        Hiker.turnLeft();
        Hiker.turnLeft();
        Hiker.move();
        
        Hiker.turnLeft();
        Hiker.move();
        Hiker.move();    
        Hiker.turnLeft();
        
        Hiker.turnLeft();
        Hiker.turnLeft();
        Hiker.move();
        Hiker.move();
        
        Hiker.turnLeft();
        Hiker.turnLeft();
        Hiker.turnLeft();
        Hiker.move();
        
        Hiker.turnLeft();
        Hiker.move();
        Hiker.turnLeft();
        Hiker.turnLeft();
        
        Hiker.turnLeft();
        Hiker.move();
        Hiker.move();
        Hiker.turnLeft();
        
        
        
        
        
    }
}
