
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
 * @author petet9087
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create a City
        City Hill = new City ();
        // Create a Robot
         Robot Lang = new Robot (Hill,3,0,Direction.EAST);
         
         // Create a wall
         
        new Wall (Hill,3,2,Direction.WEST);
        new Wall (Hill,3,2,Direction.NORTH);
        new Wall (Hill,2,3,Direction.WEST);
        new Wall (Hill,1,3,Direction.WEST);
        new Wall (Hill,1,3,Direction.NORTH);
        new Wall (Hill,1,3,Direction.EAST);
        new Wall (Hill,2,4,Direction.NORTH);
        new Wall (Hill,2,4,Direction.EAST);
        new Wall (Hill,3,4,Direction.EAST);
        new Thing (Hill,3,1);
        
       // Get Lang to Move
        Lang.move();
        Lang.pickThing();
        Lang.turnLeft();
        Lang.move();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.move();
        Lang.turnLeft();
        Lang.move();
        Lang.move();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.move();
        Lang.putThing();
        Lang.move();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.move();
        Lang.turnLeft();
        Lang.move();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.move();
        Lang.move();
        Lang.turnLeft();
    }
}
