
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANNT0773
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw=new City();
        Robot taylor=new Robot(kw,3,0,Direction.EAST);
        
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,1,3,Direction.WEST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        
        new Thing(kw,3,1);
        
        taylor.canPickThing();
        taylor.move();
        taylor.pickThing();
        taylor.turnLeft();
        taylor.move();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.move();
        taylor.turnLeft();
        taylor.move();
        taylor.move();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.move();
        taylor.putThing();
        taylor.move();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.move();
        taylor.turnLeft();
        taylor.move();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.turnLeft();
        taylor.move();
        taylor.move();
        taylor.turnLeft();
       
       
       
        
                
        // TODO code application logic here
    }
}
