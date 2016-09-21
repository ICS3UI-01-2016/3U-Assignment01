
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
 * @author ANNT0773
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw=new City();
        Robot taylor=new Robot(kw,0,2,Direction.WEST);
        
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,1,2,Direction.EAST);
        
        //; get taylor to move
        taylor.move();
        taylor.move();
        taylor.turnLeft();
        taylor.move();
        taylor.move();
        taylor.move();
        taylor.turnLeft();
        taylor.move();
        taylor.move();
        taylor.move();
        taylor.turnLeft();
        taylor.move();
        taylor.move();
        taylor.move();
        taylor.turnLeft();
        taylor.move();
        taylor.move();
       
        
        
        
    }
}
