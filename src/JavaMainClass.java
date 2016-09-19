
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
 * @author tomlj9878
 */
public class JavaMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city for Robot
        City JT = new City();
        //Create a Robot
        Robot a = new Robot(JT,1,2,Direction.EAST);
        //Create walls
        new Wall(JT,2,3,Direction.NORTH);
        new Wall(JT,2,3,Direction.WEST);
        new Wall(JT,2,4,Direction.NORTH);
        new Wall(JT,2,4,Direction.EAST);
        new Wall(JT,3,4,Direction.EAST);
        new Wall(JT,3,4,Direction.SOUTH);
        new Wall(JT,3,3,Direction.SOUTH);
        new Wall(JT,3,3,Direction.WEST);
        
        a.move();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        a.move();
        a.move();
        a.move();
        a.turnLeft();
        a.turnLeft();
        a.turnLeft();
        
    }
}
