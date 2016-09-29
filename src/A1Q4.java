
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
 * @author slatz8075
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A1Q3 = new City();
        //Create the Robots
        Robot Jeff = new Robot(A1Q3, 0, 0, Direction.SOUTH);
        Robot Karel = new Robot(A1Q3, 0, 1, Direction.SOUTH);
        //Create 
        new Wall(A1Q3, 0, 1, Direction.WEST);
        new Wall(A1Q3, 1, 1, Direction.WEST);
        new Wall(A1Q3, 1, 1, Direction.SOUTH);
        Jeff.move();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
    }
}
