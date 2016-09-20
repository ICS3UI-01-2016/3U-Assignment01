
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //create a city
    City lon = new City();
    //create a robot
    Robot dart = new Robot (lon,1,2,Direction.SOUTH);
        
            // TODO code application logic here
    
    //placing walls
    new Wall(lon,1,1,Direction.WEST);
    new Wall(lon,2,1,Direction.WEST);
    new Wall(lon,1,1,Direction.NORTH);
    new Wall(lon,1,2,Direction.NORTH);
    new Wall(lon,1,2,Direction.EAST);
    new Wall(lon,1,2,Direction.SOUTH);
    
    //place thing
    new Thing(lon,2,2);
    
    
    //move the robot
    dart.turnLeft();
    dart.turnLeft();
    dart.turnLeft();
    dart.move();
    dart.turnLeft();
    dart.move();
    dart.turnLeft();
    dart.move();
    
    //retrieving the thing
    dart.pickThing();
    dart.turnLeft();
    dart.turnLeft();
    dart.move();
    dart.turnLeft();
    dart.turnLeft();
    dart.turnLeft();
    dart.move();
    dart.turnLeft();
    dart.turnLeft();
    dart.turnLeft();
    dart.move();
    dart.turnLeft();
    dart.turnLeft();
    dart.turnLeft();
    
    
    
    
    
    
    
       }
}
