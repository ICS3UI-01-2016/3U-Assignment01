
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
 * @author smith3577
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City Kitchener = new City();
        //create robot
        Robot Chappie = new Robot(Kitchener,3,0,Direction.EAST);
        //create thing
        new Thing(Kitchener,3,1);
        // create walls
        new Wall(Kitchener,3,2,Direction.WEST);
        new Wall(Kitchener,3,2,Direction.NORTH);
        new Wall(Kitchener,2,3,Direction.WEST);
        new Wall(Kitchener,1,3,Direction.WEST);
        new Wall(Kitchener,1,3,Direction.NORTH);
        new Wall(Kitchener,1,3,Direction.EAST);
        new Wall(Kitchener,2,4,Direction.NORTH);
        new Wall(Kitchener,2,4,Direction.EAST);
        new Wall(Kitchener,3,4,Direction.EAST);
        // move Chappie
        Chappie.move();
        Chappie.pickThing();
        Chappie.turnLeft();
        Chappie.move();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.move();
        Chappie.turnLeft();
        Chappie.move();
        Chappie.move();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.move();
        Chappie.putThing();
        Chappie.move();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.move();
        Chappie.turnLeft();
        Chappie.move();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.turnLeft();
        Chappie.move();
        Chappie.move();
        Chappie.turnLeft();
         }
    
}