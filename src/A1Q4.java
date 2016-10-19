
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
        City gh = new City();
        Robot jet = new Robot(gh, 3, 2, Direction.SOUTH);
        Robot bum = new Robot(gh, 3, 3, Direction.SOUTH);
        
        //Create Walls
        new Wall(gh, 3, 3, Direction.WEST);
        new Wall(gh, 4, 3, Direction.WEST);
        new Wall(gh, 4, 3, Direction.SOUTH);
        
        //Get Jet to move down, around the corner and stop at the bottom of the walls.
        jet.move();
        jet.move();
        jet.turnLeft();
        jet.move();
        //Get Bum to move down and around the wall so that he is facing the robot jet.
        bum.move();
        bum.turnLeft();
        bum.move();
        bum.turnLeft();
        bum.turnLeft();
        bum.turnLeft();
        bum.move();
        bum.turnLeft();
        bum.turnLeft();
        bum.turnLeft();
        bum.move();
       
        
        
        
        
        
                
        
    }
}
