
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
 * @author macdt8987
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New city
        City wer = new City();
        // Create robots
        Robot asd = new Robot(wer,0,0,Direction.EAST);
        Robot zxc = new Robot (wer,0,1,Direction.WEST);
        // Make Walls
        new Wall (wer,0,1,Direction.WEST);
        new Wall (wer,1,1,Direction.WEST);
        new Wall (wer,1,1,Direction.SOUTH);
        // Make Robots move
        asd.turnLeft();
        zxc.turnLeft();
        asd.turnLeft();
        asd.turnLeft();
        asd.move();
        zxc.move();
        zxc.turnLeft();
        zxc.move();
        asd.move();
        asd.turnLeft();
        zxc.turnLeft();
        zxc.turnLeft();
        zxc.turnLeft();
        zxc.move();
        asd.move();
        zxc.turnLeft();
        zxc.turnLeft();
        zxc.turnLeft();
        zxc.move();
    }
}
