
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    // create a city
    City kw = new City();
        
    // create two robots
    Robot dino = new Robot(kw,0,1,Direction.WEST);
    Robot jimmy = new Robot(kw,3,3,Direction.EAST);
        
    // give robots initials
    dino.setLabel("M");
    jimmy.setLabel("K");
        
    // create walls
    new Wall(kw,2,3,Direction.NORTH);
    new Wall(kw,2,3,Direction.WEST);
    new Wall(kw,2,3,Direction.EAST);
    new Wall(kw,3,3,Direction.EAST);
    new Wall(kw,3,3,Direction.SOUTH);
        
    // create things
    new Thing(kw,0,0);
    new Thing(kw,1,0);
    new Thing(kw,1,1);
    new Thing(kw,1,2);
    new Thing(kw,2,2);
    
    // get the robots to turn left
    jimmy.turnLeft();
    jimmy.turnLeft();
    jimmy.move();
    // get robots to pick things
    dino.move();
    dino.pickThing();
    jimmy.turnLeft();
    jimmy.turnLeft();
    jimmy.turnLeft();
    dino.turnLeft();
    jimmy.move();
    jimmy.pickThing();
    dino.move();
    dino.pickThing();
    jimmy.move();
    jimmy.pickThing();
    dino.turnLeft();
    jimmy.turnLeft();
    dino.move();
    dino.pickThing();     
    
    }
}
