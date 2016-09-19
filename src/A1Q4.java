
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city for robot
    City to = new City();
    //create a robot
    Robot rick = new Robot(to,0,0,Direction.SOUTH);
    Robot alfred = new Robot(to,0,1,Direction.SOUTH);
   
    //create walls
    new Wall(to,0,1,Direction.WEST);
    new Wall(to,1,1,Direction.WEST);
    new Wall(to,1,1,Direction.SOUTH);
    
    //get robots to move
    alfred.move();
    rick.move();
    alfred.turnLeft();
    alfred.move();
    rick.move();
    alfred.turnLeft();
    
    alfred.turnLeft();
    alfred.turnLeft();
    rick.turnLeft();
    alfred.move();
    alfred.turnLeft();
    alfred.turnLeft();
    alfred.turnLeft();
    rick.move();
    alfred.move();
    }
}
