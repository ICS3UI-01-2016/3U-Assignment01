
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
 * @author vandl4973
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City MD = new City();
        new Wall(MD,1,3,Direction.NORTH);
        new Wall(MD,3,2,Direction.NORTH);
        new Wall(MD,2,4,Direction.NORTH);
        new Wall(MD,1,3,Direction.EAST);
        new Wall(MD,2,4,Direction.EAST);
        new Wall(MD,3,4,Direction.EAST);
        new Wall(MD,1,3,Direction.WEST);
        new Wall(MD,2,3,Direction.WEST);
        new Wall(MD,3,2,Direction.WEST);
        Robot mo= new Robot (MD,3,0,Direction.EAST);
        new Thing(MD,3,1);
        mo.move();
        mo.pickThing();
        mo.turnLeft();mo.move();
        mo.turnLeft();mo.turnLeft();mo.turnLeft();
        mo.move();mo.turnLeft();
        mo.move();mo.move();
        mo.turnLeft();mo.turnLeft();mo.turnLeft();
        mo.move(); mo.putThing();
        mo.move();mo.turnLeft();mo.turnLeft();mo.turnLeft();
        mo.move();mo.turnLeft();
        mo.move();mo.turnLeft();mo.turnLeft();mo.turnLeft();
        mo.move();mo.move();mo.turnLeft();
    }
}
