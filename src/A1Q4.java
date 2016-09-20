
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
 * @author bulka4927
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city
        City w = new City();
        
        //placing walls
        new Wall(w,0,1,Direction.WEST);
        new Wall(w,1,1,Direction.WEST);
        new Wall(w,1,1,Direction.SOUTH);
        
        
        //create dos robots
        Robot k = new Robot(w,0,1,Direction.SOUTH);
        Robot r = new Robot(w,0,0,Direction.SOUTH);
        
        //moving the robots
        k.move();
        r.move();
        k.turnLeft();
        r.move();
        k.move();
        r.turnLeft();
        k.turnLeft();
        k.turnLeft();
        k.turnLeft();
        k.move();
        k.turnLeft();
        k.turnLeft();
        k.turnLeft();
        k.move();
        r.move();
        
    }
}
