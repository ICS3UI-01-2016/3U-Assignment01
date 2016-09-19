
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a city for your robot
        City NY = new City ();
        // create a robot
        Robot Lang = new Robot (NY,1,2,Direction.SOUTH);
        
       // Create a wall
        new Wall (NY,1,2,Direction.SOUTH);
        new Wall (NY,1,2,Direction.EAST);
        new Wall (NY,1,2,Direction.NORTH);
        new Wall (NY,1,1,Direction.NORTH);
        new Wall (NY,1,0,Direction.EAST);
        new Wall (NY,2,0,Direction.EAST);
        new Wall (NY,2,1,Direction.SOUTH);
        new Thing (NY,2,2);
        
        // get Lang to move
        Lang.setColor(Color.orange);
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();        
        Lang.move();
        Lang.turnLeft();
        Lang.move();
        Lang.turnLeft();
        Lang.move();
        Lang.pickThing();
        Lang.turnLeft();
        Lang.turnLeft(); 
        Lang.move();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft(); 
        Lang.move();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft(); 
        Lang.move();
        Lang.turnLeft();
        Lang.turnLeft();
        Lang.turnLeft();    
        
    }
}
