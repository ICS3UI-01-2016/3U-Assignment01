
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
 * @author keyew7019
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city for robot
        City to = new City();
        //create a robot
        Robot rick = new Robot(to, 1, 2, Direction.SOUTH);

        //create walls
        new Wall(to, 1, 2, Direction.EAST);
        new Wall(to, 1, 2, Direction.SOUTH);
        new Wall(to, 1, 2, Direction.NORTH);
        new Wall(to, 1, 1, Direction.NORTH);
        new Wall(to, 1, 1, Direction.WEST);
        new Wall(to, 2, 1, Direction.WEST);
        new Wall(to, 2, 1, Direction.SOUTH);

        //get rick to move
        new Thing(to, 2, 2);

        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.pickThing();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();

    }
}
