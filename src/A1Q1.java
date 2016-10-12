
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
 * @author khans4349
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City Kitchener = new City();
        
        // create a robot
        Robot Trump = new Robot (Kitchener,0,2,Direction.WEST);
        
        // create a wall
        new Wall(Kitchener,1,2,Direction.EAST);
        new Wall(Kitchener,2,2,Direction.EAST);
        new Wall(Kitchener,2,2,Direction.SOUTH); 
        new Wall(Kitchener,2,1,Direction.SOUTH);
        new Wall(Kitchener,1,1,Direction.WEST);
        new Wall(Kitchener,2,1,Direction.WEST);
        new Wall(Kitchener,1,1,Direction.NORTH);
        new Wall(Kitchener,1,2,Direction.NORTH);
        
        // get trump to move
        Trump.move();
        Trump.move();
        Trump.turnLeft();
        
        // create a variable to stop the movemnt
        int moves = 0;
        
        while(moves < 3) {
            Trump.move();
            Trump.move();
            Trump.move();
            Trump.turnLeft();
            
            // add 1 to the movement counter
            moves = moves + 1;
        }
        
       //one more move
        Trump.move();
        
    }
}
