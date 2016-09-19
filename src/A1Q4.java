
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
 * @author vandl4973
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City RI = new City();
        new Wall (RI,0,1,Direction.WEST);
        new Wall (RI,1,1,Direction.WEST);
        new Wall (RI,1,1,Direction.SOUTH);
        Robot ghost = new Robot(RI,0,0,Direction.SOUTH);
        Robot bob = new Robot(RI,0,1,Direction.SOUTH);
        ghost.move();
        bob.move();
        ghost.move();
        bob.turnLeft(); bob.move();bob.turnLeft();bob.turnLeft();bob.turnLeft();
        ghost.turnLeft();ghost.move();
        bob.move();
        bob.turnLeft();bob.turnLeft();bob.turnLeft();bob.move();
     }
}
