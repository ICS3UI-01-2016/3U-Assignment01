
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City JT = new City();
        //create robots
        Robot M = new Robot(JT,0,1,Direction.WEST);
        Robot K = new Robot(JT,3,3,Direction.EAST);
        //Label
        M.setLabel("M");
        K.setLabel("K");
        //walls
        new Wall(JT,2,3,Direction.EAST);
        new Wall(JT,2,3,Direction.NORTH);
        new Wall(JT,2,3,Direction.WEST);
        new Wall(JT,3,3,Direction.EAST);
        new Wall(JT,3,3,Direction.SOUTH);
        //Place Things
        new Thing(JT,0,0,Direction.EAST);
        new Thing(JT,1,0,Direction.EAST);
        new Thing(JT,1,1,Direction.EAST);
        new Thing(JT,1,2,Direction.EAST);
        new Thing(JT,2,2,Direction.EAST);
        
        K.turnLeft();
        K.turnLeft();
        K.move();
        K.turnLeft();
        K.turnLeft();
        K.turnLeft();
        K.move();
        K.pickThing();
        K.move();
        K.pickThing();
        K.turnLeft();
        
        M.move();
        M.pickThing();
        M.turnLeft();
        M.move();
        M.pickThing();
        M.turnLeft();
        M.move();
        M.pickThing();
        
    }
}
