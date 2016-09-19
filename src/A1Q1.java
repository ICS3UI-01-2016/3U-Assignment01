
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
 * @author keyew7019
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //create city for robot
    City to = new City();
    //create a robot
    Robot rick = new Robot(to,0,0,Direction.SOUTH);
   
    //create walls
    new Wall(to,2,2,Direction.EAST);
    new Wall(to,2,2,Direction.SOUTH);    
    new Wall(to,2,1,Direction.SOUTH); 
    new Wall(to,1,2,Direction.EAST);
    new Wall(to,1,2,Direction.NORTH);
    new Wall(to,1,1,Direction.NORTH);
    new Wall(to,2,1,Direction.WEST);
    new Wall(to,1,1,Direction.WEST);
    
    //get rick to move
    //create a variable to stop the movement
        int moves = 0;
        while (moves < 4) {
            rick.move();
            rick.move();
            rick.move();
            rick.turnLeft();
            //add 1 to the movement counter
            moves = moves + 1;
    
    }
   
}}

