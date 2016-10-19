
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
 * @author lawd8918
 */
public class A1q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make City
        City ktown = new City();

        //Make Walls
        new Wall(ktown, 0, 1, Direction.WEST);
        new Wall(ktown, 1, 1, Direction.WEST);
        new Wall(ktown, 1, 1, Direction.SOUTH);

        //Make robots
        Robot dave = new Robot(ktown, 0, 0, Direction.SOUTH);
        Robot joe = new Robot(ktown, 0, 1, Direction.SOUTH);

        //Make Robots move
        joe.move();
        joe.turnLeft();
        dave.move();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        dave.move();
        dave.turnLeft();
        joe.move();
        dave.move();

    }
}
