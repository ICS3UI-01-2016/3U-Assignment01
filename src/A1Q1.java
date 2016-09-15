
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manok5757
 */
public class A1Q1 {
//Make a program to move robot around walls
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City km = new City();
        //create a robot
        Robot hat = new Robot(km,0,2,Direction.WEST);
         //make wall inbetween hat's movement CHANGE LOCATION
        new Wall (km,1,2,Direction.EAST);
        new Wall (km,2,2,Direction.EAST);
        new Wall (km,1,2,Direction.NORTH);
        new Wall (km,1,1,Direction.NORTH);
        new Wall (km,2,2,Direction.SOUTH);
        new Wall (km,2,1,Direction.SOUTH);
        new Wall (km,1,1,Direction.WEST);
        new Wall (km,2,1,Direction.WEST);
        //get bob to move
        hat.move();
        hat.move();
        hat.turnLeft();
        hat.move();
        hat.move();
        hat.move();
        hat.turnLeft();
        hat.move();
        hat.move();
        hat.move();
        hat.turnLeft();
        hat.move();
        hat.move();
        hat.move();
        hat.turnLeft();
        hat.move();
      
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    }
}
