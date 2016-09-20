
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City km = new City();
        //create walls
        new Wall (km,4,3,Direction.NORTH);
        new Wall (km,3,3,Direction.EAST);
        new Wall (km,2,3,Direction.EAST);
        new Wall (km,1,3,Direction.SOUTH);
        new Wall (km,2,3,Direction.WEST);
        //place expenive items on ground
        new Thing (km,0,0);
        new Thing (km,1,0);
        new Thing (km,1,1);
        new Thing (km,1,2);
        new Thing (km,2,2);
        //create a new robot
        Robot karel = new Robot (km,3,3,Direction.EAST);
        //label karel
        karel.setLabel("K");
        //create a new robot
        Robot mark = new Robot (km,0,1,Direction.WEST);
        //label mark
        mark.setLabel("M");
        //make mark move to final position where he meets karel and picks up the items
        mark.move();
        mark.pickThing();
        mark.turnLeft();
        mark.move();
        mark.pickThing();
        mark.turnLeft();
        mark.move();
        mark.pickThing();
        //make karel move to final position where he meets mark and picks up the items
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
