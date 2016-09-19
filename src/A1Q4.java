
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
 * @author baayl3669
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for robot
        City af = new City();
        // create a robot
        Robot Ram = new Robot(af,0,0,Direction.SOUTH);
        Robot Felix = new Robot(af,0,1,Direction.SOUTH);
        
        // create wall
        new Wall(af,0,1,Direction.WEST);
        new Wall(af,1,1,Direction.WEST);
        new Wall(af,1,1,Direction.SOUTH);
        
        // make two robot move alternately
        Ram.move();
        Felix.move();
        Felix.turnLeft();
        Ram.move();
        Felix.move();
        Ram.turnLeft();
        Felix.turnLeft();
        Felix.turnLeft();
        Felix.turnLeft();
        Felix.move();
        Felix.turnLeft();
        Felix.turnLeft();
        Felix.turnLeft();
        Ram.move();
        Felix.move();
        
        
    }
}
