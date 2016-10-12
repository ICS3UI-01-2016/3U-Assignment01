
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City sm = new City();
        
        // create a robot
        Robot maria = new Robot(sm,0,1,Direction.WEST);
        Robot karel = new Robot(sm,3,3,Direction.EAST);
        
        // create a wall
        new Wall(sm,3,3,Direction.EAST);
        new Wall(sm,3,3,Direction.SOUTH);
        new Wall(sm,2,3,Direction.EAST);
        new Wall(sm,2,3,Direction.NORTH);
        new Wall(sm,2,3,Direction.WEST);
        
        // create a thing
        new Thing(sm,0,0);
        new Thing(sm,1,0);
        new Thing(sm,1,1);
        new Thing(sm,1,2);
        new Thing(sm,2,2);
        
        // set robot name
        maria.setLabel("M");
        karel.setLabel("K");
        
        // get robots to move
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        
        karel.move();
        karel.pickThing();
        
        maria.move();
        maria.pickThing();
        
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        
        
        
        
        
        
        
    }
}
