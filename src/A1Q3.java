
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
 * @author fitaa8228
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot Jim = new Robot(kw,3,0,Direction.EAST);
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,3,Direction.WEST);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        new Thing(kw,3,1);
        Jim.move();
        Jim.pickThing();
        Jim.turnLeft();
        Jim.move();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.move();
        Jim.turnLeft();
        Jim.move();
        Jim.move();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.move();
        Jim.putThing();
        Jim.move();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.move();
        Jim.turnLeft();
        Jim.move();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.move();
        Jim.move();
        Jim.turnLeft();
    }
}
