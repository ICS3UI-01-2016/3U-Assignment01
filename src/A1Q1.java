
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A1Q1 = new City();
        //Create a Robot
        Robot Jeff = new Robot(A1Q1, 0, 2, Direction.WEST);
        //Create walls
        new Wall(A1Q1, 1, 2, Direction.NORTH);
        new Wall(A1Q1, 1, 1, Direction.NORTH);
        new Wall(A1Q1, 1, 1, Direction.WEST);
        new Wall(A1Q1, 2, 1, Direction.WEST);
        new Wall(A1Q1, 2, 2, Direction.EAST);
        new Wall(A1Q1, 1, 2, Direction.EAST);
        new Wall(A1Q1, 2, 1, Direction.SOUTH);
        new Wall(A1Q1, 2, 2, Direction.SOUTH);
        //Get the Robot to Move
        Jeff.move();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.move();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.move();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.move();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();

    }
}
