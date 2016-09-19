
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
 * @author schum0689
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create city 
        City Q2 = new City();
        
        // Create walls
        new Wall(Q2,1,1,Direction.NORTH);
        new Wall(Q2,1,2,Direction.NORTH);
        new Wall(Q2,1,2,Direction.EAST);
        new Wall(Q2,1,2,Direction.SOUTH);
        new Wall(Q2,2,1,Direction.SOUTH);
        new Wall(Q2,2,1,Direction.WEST);
        new Wall(Q2,1,1,Direction.WEST);
        
        // Add robot
        Robot rick = new Robot(Q2,1,2,Direction.SOUTH);
        rick.setColor(Color.BLACK);
        
        // Add thing
        new Thing(Q2,2,2);
        
        // Move robot
        rick.turnLeft();
        rick.turnLeft();
        int moves = 0;
        while (moves < 3) {
            moves = moves + 1;
            rick.turnLeft();
            rick.move();
        }
       
        rick.pickThing();
        rick.turnLeft();
        rick.turnLeft();
        
        int moves = 0;
        while (moves < 3) {
            moves = moves + 1;
            rick.move();
            rick.turnLeft();
            rick.turnLeft();
            rick.turnLeft();
        }
        
        rick.putThing();
        
    }
}
