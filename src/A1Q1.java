
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for the robot
    City ow = new City();
        //create a robot
    Robot bulka = new Robot(ow,0,2,Direction.WEST);
            // TODO code application logic here 
    
    //placing walls
    new Wall (ow,1,1,Direction.WEST);
    new Wall (ow,2,1,Direction.WEST);
    new Wall (ow,2,1,Direction.SOUTH);
    new Wall (ow,2,2,Direction.SOUTH);
    new Wall (ow,1,2,Direction.EAST);
    new Wall (ow,2,2,Direction.EAST);
    new Wall (ow,1,2,Direction.NORTH);
    new Wall (ow,1,1,Direction.NORTH);
    
    //moving the robot
    bulka.move();
    bulka.move();
    bulka.turnLeft();
    bulka.move();
    bulka.move();
    bulka.move();
    bulka.turnLeft();
    bulka.move();
    bulka.move();
    bulka.move();
    bulka.turnLeft();
    bulka.move();
    bulka.move();
    bulka.move();
    bulka.turnLeft();
    bulka.move();
    
    
    
    
    
    
    
       
    
    
    
 }
}
