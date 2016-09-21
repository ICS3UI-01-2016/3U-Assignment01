
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
 * @author gavra1870
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cretae City for robot
        City Gh = new City();
        Robot Jet = new Robot(Gh, 3, 2, Direction.SOUTH);
        Robot Bum = new Robot(Gh, 3, 3, Direction.SOUTH);
        
        //Create Walls
        new Wall(Gh, 3, 3, Direction.WEST);
        new Wall(Gh, 4, 3, Direction.WEST);
        new Wall(Gh, 4, 3, Direction.SOUTH);
        
        //Get Jet to move
        Jet.move();
        Jet.move();
        Jet.turnLeft();
        Jet.move();
        //Get Bum to move
        Bum.move();
        Bum.turnLeft();
        Bum.move();
        Bum.turnLeft();
        Bum.turnLeft();
        Bum.turnLeft();
        Bum.move();
        Bum.turnLeft();
        Bum.turnLeft();
        Bum.turnLeft();
        Bum.move();
        
        
        
        
        
        
                
        
    }
}
