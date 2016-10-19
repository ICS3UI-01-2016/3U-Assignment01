
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
public class A1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city
        City ktown = new City();

        //Create a robot
        Robot dave = new Robot(ktown, 0, 2, Direction.WEST);


        //Create a wall
        new Wall(ktown, 1, 1, Direction.NORTH);
        new Wall(ktown, 1, 1, Direction.WEST);
        new Wall(ktown, 2, 1, Direction.WEST);
        new Wall(ktown, 2, 2, Direction.SOUTH);
        new Wall(ktown, 2, 1, Direction.SOUTH);
        new Wall(ktown, 1, 2, Direction.EAST);
        new Wall(ktown, 2, 2, Direction.EAST);
        new Wall(ktown, 1, 2, Direction.NORTH);

        //Get Dave to move around square
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();





    }
}
