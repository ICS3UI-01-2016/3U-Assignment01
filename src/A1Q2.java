
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City Kitchener = new City();
        //create robot
        Robot Robocop = new Robot(Kitchener,1,2,Direction.SOUTH);
        //Create walls
        new Wall(Kitchener,1,2,Direction.EAST);
        new Wall(Kitchener,1,2,Direction.NORTH);
        new Wall(Kitchener,1,2,Direction.SOUTH);
        new Wall(Kitchener,1,1,Direction.NORTH);
        new Wall(Kitchener,1,1,Direction.WEST);
        new Wall(Kitchener,2,1,Direction.WEST);
        new Wall(Kitchener,2,1,Direction.SOUTH);
        //create a thing
        new Thing(Kitchener,2,2);
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.move();
        Robocop.turnLeft();
        Robocop.move();
        Robocop.turnLeft();
        Robocop.move();
        Robocop.pickThing();
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.move();
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.move();
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.move();
        Robocop.turnLeft();
        Robocop.turnLeft();
        Robocop.turnLeft();
        
    }
}
