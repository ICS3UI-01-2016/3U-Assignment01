
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
 * @author fabed2976
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //A1Q3
        City SK = new City();
        Robot Chen = new Robot (SK, 4,0, Direction. EAST);
        
        //create Walls/mountain
        new Wall (SK, 4,2, Direction. WEST);
        new Wall (SK, 4,2, Direction. NORTH);
        new Wall (SK, 3,3, Direction. WEST);
        new Wall (SK, 2,3, Direction. WEST);
        new Wall (SK, 2,3, Direction. NORTH);
        new Wall (SK, 2,3, Direction. EAST) ;
        new Wall (SK, 3,4, Direction. NORTH);
        new Wall (SK, 3,4, Direction. EAST);
        new Wall (SK, 4,4, Direction. EAST);
        new Thing (SK, 4,1);
        
        //Get Chen to move
        Chen. move();
        Chen. pickThing();
        Chen. turnLeft();
        Chen. move();
        Chen. turnLeft();
        Chen. turnLeft ();
        Chen. turnLeft ();
        Chen. move();
        Chen. turnLeft();
        Chen.move();
        Chen.move();
        Chen.turnLeft();
        Chen.turnLeft();
        Chen.turnLeft();
        Chen.move();
        Chen.putThing();
        
        
                
                
        
        
        
    }
}
