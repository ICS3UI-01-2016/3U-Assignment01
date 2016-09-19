
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create city
        City Kitchener = new City();
        //create robots
        Robot Maria = new Robot(Kitchener,0,1,Direction.WEST);
        Robot Karel = new Robot(Kitchener,3,3,Direction.EAST);
        Maria.setLabel("M");
        Karel.setLabel("K");
        // create things and walls
        new Thing (Kitchener,0,0);
        new Thing (Kitchener,1,0);
        new Thing (Kitchener,1,1);
        new Thing (Kitchener,1,2);
        new Thing (Kitchener,2,2);
        new Wall (Kitchener,2,3,Direction.WEST);
        new Wall (Kitchener,2,3,Direction.EAST);
        new Wall (Kitchener,2,3,Direction.NORTH);
        new Wall (Kitchener,3,3,Direction.EAST);
        new Wall (Kitchener,3,3,Direction.SOUTH);
        //Move robots
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Maria.move();
        Karel.pickThing();
        Maria.pickThing();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();
        Maria.turnLeft();
        Karel.move();
        Maria.move();
        Karel.turnLeft();
        Karel.pickThing();
        Maria.pickThing();
        
        
    }
}
