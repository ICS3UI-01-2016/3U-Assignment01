
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petet9087
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a City
        City NY = new City();
        // Create a robot
        Robot Lang = new Robot (NY,3,3,Direction.EAST);
        // Create another Robot
        Robot Mary = new Robot (NY,0,1,Direction.WEST);
        // Create a Wall
        new Wall (NY,3,3,Direction.SOUTH);
        new Wall (NY,3,3,Direction.EAST);
        new Wall (NY,2,3,Direction.WEST);
        new Wall (NY,2,3,Direction.EAST);
        new Wall (NY,2,3,Direction.NORTH);
        new Thing (NY,0,0);
        new Thing (NY,1,0);
        new Thing (NY,1,1);
        new Thing (NY,1,2);
        new Thing (NY,2,2);
        // Get Mary and Lang to move
        Lang.setColor(Color.blue);
        Mary.setColor(Color.orange);
        Lang.turnLeft();
        Lang.turnLeft();
        Mary.move();
        Lang.move();
        Mary.pickThing();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();
        Mary.turnLeft();
        Lang.move();
        Lang.pickThing();
        Mary.move();
        Mary.pickThing();
        Mary.turnLeft();
        Lang.move();
        Lang.pickThing();
        Mary.move();
        Mary.pickThing();
        Lang.turnLeft();
        
    }
}
