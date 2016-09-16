
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
 * @author fitaa8228
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot Jim = new Robot(kw,0,0,Direction.SOUTH);
        Robot Ben = new Robot(kw,0,1,Direction.SOUTH);
        new Wall(kw,0,1,Direction.WEST);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        Jim.move();
        Jim.move();
        Jim.turnLeft();
        Ben.move();
        Ben.turnLeft();
        Ben.move();
        Ben.turnLeft();
        Ben.turnLeft();
        Ben.turnLeft();
        Ben.move();
        Ben.turnLeft();
        Ben.turnLeft();
        Ben.turnLeft();
        Jim.move();
        Ben.move();
    }
}
