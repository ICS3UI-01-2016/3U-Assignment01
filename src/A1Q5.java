
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robot
        City A1Q5 = new City();
        //Create the Robots
        Robot m = new Robot(A1Q5, 0, 1, Direction.WEST);
        Robot k = new Robot(A1Q5, 3, 3, Direction.EAST);
        //Create 
        new Wall(A1Q5, 3, 3, Direction.EAST);
        new Wall(A1Q5, 3, 3, Direction.SOUTH);
        new Wall(A1Q5, 2, 3, Direction.WEST);
        new Wall(A1Q5, 2, 3, Direction.EAST);
        new Wall(A1Q5, 2, 3, Direction.NORTH);

        new Thing(A1Q5, 0, 0);
        new Thing(A1Q5, 1, 0);
        new Thing(A1Q5, 1, 1);
        new Thing(A1Q5, 1, 2);
        new Thing(A1Q5, 2, 2);

        m.move();
        m.pickThing();
        m.turnLeft();
        m.move();
        m.pickThing();
        m.turnLeft();
        m.move();
        m.pickThing();

        k.turnLeft();
        k.turnLeft();
        k.move();
        k.turnLeft();
        k.turnLeft();
        k.turnLeft();
        k.move();
        k.pickThing();
        k.move();
        k.pickThing();
        k.turnLeft();
    }
}
