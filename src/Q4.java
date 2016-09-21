
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
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw=new City();
        Robot a=new Robot(kw,0,0,Direction.SOUTH);
        Robot b=new Robot(kw,0,1,Direction.SOUTH);
        
        new Wall(kw,0,1,Direction.WEST);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        
        a.move();
        b.move();
        a.move();
        b.turnLeft();
        a.turnLeft();
        b.move();
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
        b.move();
        a.move();
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
        b.move();
      
        // TODO code application logic here
    }
}
