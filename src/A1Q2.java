
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
 * @author ayyaf3300
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    // create a city
    City NYC = new City();
    
    // create a robot
    Robot dino = new Robot (NYC,1,2,Direction.SOUTH);
    
    // create walls
    
    new Wall (NYC,1,2,Direction.NORTH);
    new Wall (NYC,1,2,Direction.EAST);
    new Wall (NYC,1,1,Direction.WEST);
    new Wall (NYC,2,1,Direction.WEST);
    new Wall (NYC,1,1,Direction.NORTH);
    new Wall (NYC,1,2,Direction.SOUTH);
    new Wall (NYC,2,1,Direction.SOUTH);
    
    // add thing
    new Thing (NYC,2,2);
    
    // tell robot to move left
    dino.turnLeft();
    dino.turnLeft();
    dino.turnLeft();
    // get the robot to move
    dino.move(); 
    dino.turnLeft();
    dino.move();   
    dino.turnLeft();
    dino.move();   
    // get robot to pick thing
    dino.pickThing();   
    dino.turnLeft();
    dino.turnLeft();   
    dino.move();   
    dino.turnLeft();
    dino.turnLeft();
    dino.turnLeft();
    dino.move(); 
    dino.turnLeft();
    dino.turnLeft();
    dino.turnLeft();
    dino.move();
    dino.turnLeft();
    dino.turnLeft();
    dino.turnLeft();
    
    }
}

