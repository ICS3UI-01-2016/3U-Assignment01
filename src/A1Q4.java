
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petet9087
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create a City
        City NY = new City ();
        // Create a robot
        Robot Lang = new Robot (NY,0,0,Direction.SOUTH);
        // Create another Robot
        Robot Jim = new Robot (NY,0,1,Direction.SOUTH);
        // create a wall
        new Wall (NY,0,1,Direction.WEST);
        new Wall (NY,1,1,Direction.WEST);
        new Wall (NY,1,1,Direction.SOUTH);
        // Get Lang and Jim to Move
        Jim.move();
        Lang.move();
        Jim.turnLeft();
        Jim.move();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.move();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Lang.move();
        Lang.turnLeft();
        Jim.move();
        Lang.move();
    
    
    
    
    
    }
}
