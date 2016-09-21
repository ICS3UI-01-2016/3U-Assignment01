
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City Q4 = new City();
        RobotSE one = new RobotSE(Q4,0,0,Direction.SOUTH);
        one.setColor(Color.BLACK);
        RobotSE two = new RobotSE(Q4,0,1,Direction.SOUTH);
        two.setColor(Color.BLACK);
        new Wall(Q4,0,1,Direction.WEST);
        new Wall(Q4,1,1,Direction.WEST);
        new Wall(Q4,1,1,Direction.SOUTH);
        two.move();
        one.move();
        two.turnLeft();
        two.move();
        one.move();
        two.turnRight();
        two.move();
        one.turnLeft();
        two.turnRight();
        one.move();
        two.move();
    }
}
