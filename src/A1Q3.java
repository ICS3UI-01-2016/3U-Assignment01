
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a city for robot
        City af = new City();
        // create a robot
        Robot Ram = new Robot(af,3,0,Direction.EAST);
        
        // create flag
        new Thing(af,3,1);
        
        // create walls
        new Wall(af,3,2,Direction.WEST);
        new Wall(af,3,2,Direction.NORTH);
        new Wall(af,2,3,Direction.WEST);
        new Wall(af,1,3,Direction.WEST);
        new Wall(af,1,3,Direction.NORTH);
        new Wall(af,1,3,Direction.EAST);
        new Wall(af,2,4,Direction.NORTH);
        new Wall(af,2,4,Direction.EAST);
        new Wall(af,3,4,Direction.EAST);
        
        // move robot up the mountain
        Ram.move();
        Ram.pickThing();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.move();
        Ram.move();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();
        Ram.putThing();
        Ram.move();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.move();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.turnLeft();
        Ram.move();
        Ram.move();
        Ram.turnLeft();
        
        
        
                
    }
}
