
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City Kitchener = new City();
        
        // Create a robot
        Robot Trump = new Robot(Kitchener,1,2,Direction.SOUTH);
        
        // Create a wall
        new Wall(Kitchener,1,2,Direction.NORTH);
        new Wall(Kitchener,1,1,Direction.NORTH);
        new Wall(Kitchener,1,1,Direction.WEST);
        new Wall(Kitchener,2,1,Direction.WEST);
        new Wall(Kitchener,2,1,Direction.SOUTH);
        new Wall(Kitchener,1,2,Direction.EAST);
        new Wall(Kitchener,1,2,Direction.SOUTH);
        
        // Create a Thing
        new Thing(Kitchener,2,2);
        
        // get trump to move
        Trump.turnLeft();
        Trump.turnLeft();
      
        
        // create a variable to stop the movement
        
        int moves = 0;
        
        while(moves < 3) {
           Trump.turnLeft();
           Trump.move();
           
            // add 1 to the movement counter
            moves = moves + 1;   
        }
        
        // pick up thing
        Trump.pickThing();
        
        // Get Trump to move back
        Trump.turnLeft();
        Trump.turnLeft();
        
        // make two turns
        

        while(moves < 2); {
            Trump.move();
            Trump.turnLeft();
            Trump.turnLeft();
            Trump.turnLeft();
            
            moves = moves +1;
        }
        
        Trump.move();
        Trump.turnLeft();
        Trump.turnLeft();
        Trump.turnLeft();
        
        Trump.move();
        Trump.turnLeft();
        Trump.turnLeft();
        Trump.turnLeft();
        
        
        
        
    }
}
