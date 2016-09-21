
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create a city
        City kw = new City();
        //create a robot
        Robot dino = new Robot(kw,3,0,Direction.EAST);
        // create walls
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,1,3,Direction.WEST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        
         // create thing
        new Thing (kw,3,1); 
        // make robot to move
        dino.move();
        // get robot to pick thing
        dino.pickThing();
        // make robot turn left\
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.move();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        // get robot to drop thing
        dino.putThing();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.move();
        dino.turnLeft();
        dino.turnLeft();
        dino.turnLeft();
        dino.move();
        dino.move();
        dino.turnLeft();
                       
    }
}
