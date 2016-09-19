
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Create a city for the robot
        City ktown = new City ();
        // Create a robot
        Robot Lang = new Robot (ktown,3,3,Direction.EAST); 
        // create walls
        
        new Wall (ktown,1,1,Direction.NORTH);
        new Wall (ktown,1,2,Direction.NORTH);
        new Wall (ktown,1,2,Direction.EAST);
        new Wall (ktown,2,2,Direction.EAST);
        new Wall (ktown,1,1,Direction.WEST);
        new Wall (ktown,2,1,Direction.WEST);
        new Wall (ktown,2,1,Direction.SOUTH);
        new Wall (ktown,2,2,Direction.SOUTH);
        
        // Get Lang to move
        Lang.setColor(Color.yellow);
        Lang.turnLeft();
        Lang.move();
        Lang.move();
        Lang.move();
        Lang.turnLeft();
        Lang.move();
        Lang.move();
        Lang.move();
        Lang.turnLeft();
        Lang.move();
        Lang.move();
        Lang.move();
        Lang.turnLeft();
        Lang.move();
        Lang.move();
        Lang.move();
    
    }
}
