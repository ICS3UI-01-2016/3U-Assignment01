
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot Jim = new Robot (kw,3,3,Direction.EAST);
        Jim.setLabel("K");
        Robot Ben = new Robot (kw,0,1,Direction.WEST);
        Ben.setLabel("M");
        new Wall(kw,3,3,Direction.SOUTH);
        new Wall(kw,3,3,Direction.EAST);
        new Wall(kw,2,3,Direction.NORTH);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,2,3,Direction.WEST);
        new Thing(kw,0,0);
        new Thing(kw,1,0);
        new Thing(kw,1,1);
        new Thing(kw,1,2);
        new Thing(kw,2,2);
        Ben.move();
        Ben.pickThing();
        Ben.turnLeft();
        Ben.move();
        Ben.pickThing();
        Ben.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.move();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.turnLeft();
        Jim.move();
        Jim.pickThing();
        Jim.move();
        Jim.pickThing();
        Jim.turnLeft();
        Ben.move();
        Ben.pickThing();
        
    }
}
