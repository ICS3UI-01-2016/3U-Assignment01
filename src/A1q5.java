
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
public class A1q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make City
        City ktown = new City();

        //Make Walls
        new Wall(ktown, 3, 3, Direction.SOUTH);
        new Wall(ktown, 3, 3, Direction.EAST);
        new Wall(ktown, 2, 3, Direction.EAST);
        new Wall(ktown, 2, 3, Direction.NORTH);
        new Wall(ktown, 2, 3, Direction.WEST);

        //Make things
        new Thing(ktown, 0, 0);
        new Thing(ktown, 1, 0);
        new Thing(ktown, 1, 1);
        new Thing(ktown, 1, 2);
        new Thing(ktown, 2, 2);

        //Make Robots
        Robot Maria = new Robot(ktown, 0, 1, Direction.WEST);
        Maria.setLabel("M");
        Robot Karel = new Robot(ktown, 3, 3, Direction.EAST);
        Karel.setLabel("K");

        //Make Maria move
        Maria.move();
        Maria.pickThing();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();

        //Make Karel Move
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.pickThing();
        Karel.move();
        Karel.pickThing();
        Karel.turnLeft();
        Karel.move();

    }
}
