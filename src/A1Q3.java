
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
 * @author keyew7019
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //create city for robot
        City to = new City();
        //create a robot
        Robot rick = new Robot(to,3,0,Direction.EAST);

        //create walls
        new Wall(to,3,2,Direction.WEST);
        new Wall(to,3,2,Direction.NORTH);
        new Wall(to,2,3,Direction.WEST);
        new Wall(to,1,3,Direction.WEST);
        new Wall(to,1,3,Direction.NORTH);
        new Wall(to,1,3,Direction.EAST);
        new Wall(to,2,4,Direction.NORTH);
        new Wall(to,2,4,Direction.EAST);
        new Wall(to,3,4,Direction.EAST);
        
        //get rick to move
        new Thing(to,3,1);
        
        rick.move();
        rick.pickThing();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.move();
        rick.move();
        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        rick.putThing();
        rick.move();
        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.move();
        rick.turnLeft();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        rick.move();
        rick.turnLeft();
    }
}
