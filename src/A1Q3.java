
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
 * @author manok5757
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City km = new City();
        //create mountain with walls
        new Wall (km,3,2,Direction.WEST);
        new Wall (km,3,2,Direction.NORTH);
        new Wall (km,2,3,Direction.WEST);
        new Wall (km,1,3,Direction.WEST);
        new Wall (km,1,3,Direction.NORTH);
        new Wall (km,1,3,Direction.EAST);
        new Wall (km,2,4,Direction.NORTH);
        new Wall (km,2,4,Direction.EAST);
        new Wall (km,3,4,Direction.EAST);
        // place flag on ground
        new Thing (km,3,1);
        // create a robot
        Robot karel = new Robot (km,3,0,Direction.EAST);
        // make karel pick up a flag
        karel.move();
        karel.pickThing();
        // make karel navigate mountain
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        // make karel plant flag on top of mountain
        karel.putThing();
        // descend down mountain
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        
        
        
        
        
        
}}
