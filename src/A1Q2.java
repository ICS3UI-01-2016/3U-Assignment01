
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
 * @author slatz8075
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A1Q2 = new City();
        //Create a Robot
        Robot Jeff = new Robot(A1Q2, 1, 2, Direction.SOUTH);
        //Create 
        new Wall(A1Q2, 1, 2, Direction.NORTH);
        new Wall(A1Q2, 1, 1, Direction.NORTH);
        new Wall(A1Q2, 1, 1, Direction.WEST);
        new Wall(A1Q2, 2, 1, Direction.WEST);
        new Wall(A1Q2, 1, 2, Direction.EAST);
        new Wall(A1Q2, 2, 1, Direction.SOUTH);
        new Wall(A1Q2, 1, 2, Direction.SOUTH);
        //Create the "Newspaper"
        new Thing(A1Q2, 2, 2);
        //Get the Robot to Move
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.pickThing();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.putThing();
    }
}
