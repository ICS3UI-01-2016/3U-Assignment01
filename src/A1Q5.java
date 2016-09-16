
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
 * @author awadb3223
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create the city
        City ayr = new City ();
        
        //Create walls
        new Wall(ayr,2,3,Direction.WEST);
        new Wall(ayr,2,3,Direction.NORTH);
        new Wall(ayr,2,3,Direction.EAST);
        new Wall(ayr,3,3,Direction.EAST);
        new Wall(ayr,3,3,Direction.SOUTH);
        
        //Create the Robots
        Robot karel = new Robot(ayr,3,3,Direction.EAST);
        Robot maria = new Robot(ayr,0,1,Direction.WEST);
        
        //Create the things
        new Thing(ayr,0,0);
        new Thing(ayr,1,0);
        new Thing(ayr,1,1);
        new Thing(ayr,1,2);
        new Thing(ayr,2,2);
        
        //Make maria move and pickup the things
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        //Make Karel move and pickup things
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
    }
}
