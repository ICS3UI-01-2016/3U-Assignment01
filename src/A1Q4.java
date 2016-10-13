
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city for robots
        City Brownsville = new City();
        new Wall(Brownsville, 0, 1, Direction.WEST);
        new Wall(Brownsville, 1, 1, Direction.WEST);
        new Wall(Brownsville, 1, 1, Direction.SOUTH);
        //Create Robots
        Robot karel = new Robot(Brownsville, 0, 0, Direction.SOUTH);
        Robot maria = new Robot(Brownsville, 0, 1, Direction.SOUTH);
        karel.setColor(Color.blue);
        maria.setSpeed(10);
        //Make robots move
        maria.move();
        karel.move();
        maria.turnLeft();

        maria.move();
        maria.turnLeft();
        maria.turnLeft();
        maria.turnLeft();
        maria.move();
        karel.move();
        karel.turnLeft();
        maria.turnLeft();
        maria.turnLeft();
        maria.turnLeft();
        maria.move();
        karel.move();








    }
}
