
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
 * @author shieg0688
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city
        City NoFrills = new City();
        new Wall(NoFrills, 2, 3, Direction.WEST);
        new Wall(NoFrills, 2, 3, Direction.NORTH);
        new Wall(NoFrills, 2, 3, Direction.EAST);
        new Wall(NoFrills, 3, 3, Direction.EAST);
        new Wall(NoFrills, 3, 3, Direction.SOUTH);
        new Thing(NoFrills, 0, 0);
        new Thing(NoFrills, 1, 0);
        new Thing(NoFrills, 1, 1);
        new Thing(NoFrills, 1, 2);
        new Thing(NoFrills, 2, 2);
        //Create Robots
        Robot maria = new Robot(NoFrills, 0, 1, Direction.WEST);
        maria.setLabel("M");
        Robot karel = new Robot(NoFrills, 3, 3, Direction.EAST);
        karel.setLabel("K");
        //Make robots pick up Things
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();






    }
}
