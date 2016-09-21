
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
 * @author ayyaf3300
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    // create a city
        City kw = new City();
        
    // create two robots
        Robot dino = new Robot(kw,0,0,Direction.SOUTH);
        
        Robot jimmy = new Robot(kw,0,1,Direction.SOUTH);
    
        // create a wall
        new Wall(kw,0,1,Direction.WEST);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        
        // get robots to move
        dino.move();
        jimmy.move();
        dino.move();
        // get robots to turn left
        jimmy.turnLeft();
        dino.turnLeft();
        jimmy.move();
        dino.move();
        jimmy.turnLeft();
        jimmy.turnLeft();
        jimmy.turnLeft();
        jimmy.move();
        jimmy.turnLeft();
        jimmy.turnLeft();
        jimmy.turnLeft();
        jimmy.move();
    
    
    }
}
