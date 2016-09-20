
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
 * @author bulka4927
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City sa = new City();
    Robot bort = new Robot(sa,0,1,Direction.WEST);
    Robot ab = new Robot(sa,3,3,Direction.EAST);
    
    
    //placing things
    new Thing(sa,0,0);
    new Thing(sa,1,0);
    new Thing(sa,1,1);
    new Thing(sa,1,2);
    new Thing(sa,2,2);
    
    new Wall(sa,2,3,Direction.WEST);
    new Wall(sa,2,3,Direction.NORTH);
    new Wall(sa,2,3,Direction.EAST);
    new Wall(sa,3,3,Direction.EAST);
    new Wall(sa,3,3,Direction.SOUTH);
    
    //labeling the robots
    bort.setLabel("B");
    ab.setLabel("A");
    
    //moving bort and retrieval of things
    bort.move();
    bort.pickThing();
    bort.turnLeft();
    bort.move();
    bort.pickThing();
    bort.turnLeft();
    bort.move();
    bort.pickThing();
    
    //moving ab and retrieval of things
    ab.turnLeft();
    ab.turnLeft();
    ab.move();
    ab.turnLeft();
    ab.turnLeft();
    ab.turnLeft();
    ab.move();
    ab.pickThing();
    ab.move();
    ab.pickThing();
    ab.turnLeft();
    
    
                    
        }
}
