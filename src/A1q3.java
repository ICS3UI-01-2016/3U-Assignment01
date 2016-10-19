
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
 * @author lawd8918
 */
public class A1q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make new city
        City ktown = new City();

        //Make thing
        new Thing(ktown, 3, 1);

        //Make Walls
        new Wall(ktown, 3, 2, Direction.WEST);
        new Wall(ktown, 3, 2, Direction.NORTH);
        new Wall(ktown, 2, 3, Direction.WEST);
        new Wall(ktown, 1, 3, Direction.WEST);
        new Wall(ktown, 1, 3, Direction.NORTH);
        new Wall(ktown, 1, 3, Direction.EAST);
        new Wall(ktown, 2, 4, Direction.NORTH);
        new Wall(ktown, 2, 4, Direction.EAST);
        new Wall(ktown, 3, 4, Direction.EAST);

        //Make Robot
        Robot dave = new Robot(ktown, 3, 0, Direction.EAST);

        //Make robot move
        dave.move();
        dave.pickThing();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.putThing();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.turnLeft();


    }
}
