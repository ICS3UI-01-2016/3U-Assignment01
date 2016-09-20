
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;
import becker.robots.Robot;
import becker.robots.Thing;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a cityab = new City
        City ab = new City();
    
        //create a robot
        Robot rp = new Robot(ab,3,0,Direction.EAST);      
                
  // TODO code application logic here
  
        //placing walls
        new Wall(ab,3,2,Direction.WEST);
        new Wall(ab,3,2,Direction.NORTH);
        new Wall(ab,2,3,Direction.WEST);
        new Wall(ab,1,3,Direction.WEST);
        new Wall(ab,1,3,Direction.NORTH);
        new Wall(ab,1,3,Direction.EAST);
        new Wall(ab,2,4,Direction.NORTH);
        new Wall(ab,2,4,Direction.EAST);
        new Wall(ab,3,4,Direction.EAST);
        
        //place thing
        new Thing (ab,3,1);
        
        //retrieve thing and cross mountain
        rp.move();
        rp.pickThing();
        rp.turnLeft();
        rp.move();
        rp.turnLeft();
        rp.turnLeft();
        rp.turnLeft();
        rp.move();
        rp.turnLeft();
        rp.move();
        rp.move();
        rp.turnLeft();
        rp.turnLeft();
        rp.turnLeft();
        rp.move();
        rp.putThing();
        rp.move();
        rp.turnLeft();
        rp.turnLeft();
        rp.turnLeft();
        rp.move();
        rp.turnLeft();
        rp.move();
        rp.turnLeft();
        rp.turnLeft();
        rp.turnLeft();
        rp.move();
        rp.move();
        rp.turnLeft();
        
        
                
        
        
        
        
    }
}
