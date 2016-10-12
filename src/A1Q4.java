
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
 * @author khans4349
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City KW = new City();
        
        // create a robot
        Robot One = new Robot(KW,0,0,Direction.SOUTH);
        Robot Two = new Robot(KW,0,1,Direction.SOUTH);
        
        // Create a wall
        new Wall(KW,0,1,Direction.WEST);
        new Wall(KW,1,1,Direction.WEST);
        new Wall(KW,1,1,Direction.SOUTH);
        
        // get robots to move
        
        One.move();
        
        Two.move();
        
        One.move();
        
        Two.turnLeft();
        Two.move();
        Two.turnLeft();
        Two.turnLeft();
        Two.turnLeft();
        Two.move();
     
        One.turnLeft();
      
        Two.turnLeft();
        Two.turnLeft();
        Two.turnLeft();
        
        One.move();
        
        Two.move();
        
        
        
    }
}
