
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
 * @author awadb3223
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Mountain
        City mount = new City ();
        
        //Create Robot
        Robot bob = new Robot(mount,3,0,Direction.EAST);
        
        //Create Mountain
        new Wall(mount,3,2,Direction.WEST);
        new Wall(mount,3,2,Direction.NORTH);
        new Wall(mount,2,3,Direction.WEST);
        new Wall(mount,1,3,Direction.WEST);
new Wall(mount,1,3,Direction.NORTH);
new Wall(mount,1,3,Direction.EAST);
new Wall(mount,2,4,Direction.NORTH);
new Wall(mount,2,4,Direction.EAST);
new Wall(mount,3,4,Direction.EAST);

//Make the flag
new Thing (mount,3,1);

//Make bob move to the top
bob.move();

//make bob pickup the flag
bob.pickThing();

//make bob move again
bob.turnLeft();
bob.move();
bob.turnLeft();
bob.turnLeft();
bob.turnLeft();
bob.move();
bob.turnLeft();
bob.move();
bob.move();
bob.turnLeft();
bob.turnLeft();
bob.turnLeft();
bob.move();

//make bob plant flag
bob.putThing();

//make bob go down the mountain
bob.move();
bob.turnLeft();
bob.turnLeft();
bob.turnLeft();
bob.move();
bob.turnLeft();
bob.move();
bob.turnLeft();
bob.turnLeft();
bob.turnLeft();
bob.move();
bob.move();
bob.turnLeft();
    }
}
