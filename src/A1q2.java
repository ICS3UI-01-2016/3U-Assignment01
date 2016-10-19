
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
public class A1q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a city
        City ktown = new City();

        //Create a robot
        Robot Dave = new Robot(ktown, 1, 2, Direction.SOUTH);

        //Create walls
        new Wall(ktown, 1, 1, Direction.NORTH);
        new Wall(ktown, 1, 2, Direction.NORTH);
        new Wall(ktown, 1, 2, Direction.EAST);
        new Wall(ktown, 1, 2, Direction.SOUTH);
        new Wall(ktown, 2, 1, Direction.WEST);
        new Wall(ktown, 1, 1, Direction.WEST);
        new Wall(ktown, 2, 1, Direction.SOUTH);

        //Make thing
        new Thing(ktown, 2, 2);

        //Make Robot move
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.move();
        Dave.turnLeft();
        Dave.move();
        Dave.turnLeft();
        Dave.move();
        Dave.pickThing();

        //Return to bed
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.move();
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.move();
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.move();
        Dave.turnLeft();
        Dave.turnLeft();
        Dave.turnLeft();

    }
}
