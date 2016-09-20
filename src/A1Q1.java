
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
 * @author schum0689
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create city
        City Q1 = new City();
        
        // Add walls
        new Wall(Q1,1,1,Direction.NORTH);
        new Wall(Q1,1,2,Direction.NORTH);
        new Wall(Q1,1,2,Direction.EAST);
        new Wall(Q1,2,2,Direction.EAST);
        new Wall(Q1,2,2,Direction.SOUTH);
        new Wall(Q1,2,1,Direction.SOUTH);
        new Wall(Q1,2,1,Direction.WEST);
        new Wall(Q1,1,1,Direction.WEST);
        
        
        // Add robot
        Robot rick = new Robot(Q1,0,3,Direction.WEST);
        rick.setColor(Color.BLACK);
        
        // Move robot
        int moves = 0;
        while(moves < 4) { 
            moves = moves + 1;
            rick.move();
            rick.move();
            rick.move();
            rick.turnLeft();
        }
    }
}
