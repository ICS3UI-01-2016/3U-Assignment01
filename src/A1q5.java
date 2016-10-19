
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
        Robot maria = new Robot(ktown, 0, 1, Direction.WEST);
        maria.setLabel("M");
        Robot karel = new Robot(ktown, 3, 3, Direction.EAST);
        karel.setLabel("K");

        //Make Maria move
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();

        //Make Karel Move
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();

    }
}
