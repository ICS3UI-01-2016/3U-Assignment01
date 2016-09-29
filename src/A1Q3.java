
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A1Q3 = new City();
        //Create a Robot
        Robot Jeff = new Robot(A1Q3, 3, 0, Direction.EAST);
        //Create 
        new Wall(A1Q3, 3, 2, Direction.WEST);
        new Wall(A1Q3, 3, 2, Direction.NORTH);
        new Wall(A1Q3, 2, 3, Direction.WEST);
        new Wall(A1Q3, 1, 3, Direction.WEST);
        new Wall(A1Q3, 1, 3, Direction.EAST);
        new Wall(A1Q3, 1, 3, Direction.NORTH);
        new Wall(A1Q3, 2, 4, Direction.NORTH);
        new Wall(A1Q3, 2, 4, Direction.EAST);
        new Wall(A1Q3, 3, 4, Direction.EAST);

        new Thing(A1Q3, 3, 1);

        Jeff.move();
        Jeff.pickThing();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.putThing();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.turnLeft();
        Jeff.move();
        Jeff.move();
        Jeff.turnLeft();
    }
}
