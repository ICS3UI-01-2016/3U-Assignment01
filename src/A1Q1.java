
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
 * @author smith3577
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // create city
        City Kitchener = new City();         
        // create robot        
    Robot Terminator = new Robot (Kitchener,3,3,Direction.WEST);
    //create walls
    new Wall(Kitchener,4,3,Direction.NORTH);
    new Wall(Kitchener,4,2,Direction.NORTH);
    new Wall(Kitchener,4,2,Direction.WEST);
    new Wall(Kitchener,5,2,Direction.WEST);
    new Wall(Kitchener,5,2,Direction.SOUTH);
    new Wall(Kitchener,5,3,Direction.SOUTH);
    new Wall(Kitchener,5,3,Direction.EAST);
    new Wall(Kitchener,4,3,Direction.EAST);
// move terminator
    Terminator.move();
    Terminator.move();
    Terminator.turnLeft();
    Terminator.move();
    Terminator.move();
    Terminator.move();
    Terminator.turnLeft();
    Terminator.move();
    Terminator.move();
    Terminator.move();
    Terminator.turnLeft();
    Terminator.move();
    Terminator.move();
    Terminator.move();
    Terminator.turnLeft();
    Terminator.move();

    }

}
