
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city
        City Kitchener = new City();
        //CReate robots
        Robot R2D2 = new Robot(Kitchener,0,0,Direction.SOUTH);
        Robot C3PO = new Robot(Kitchener,0,1,Direction.SOUTH);
        //create walls
        new Wall(Kitchener,0,1,Direction.WEST);
        new Wall(Kitchener,1,1,Direction.WEST);
        new Wall(Kitchener,1,1,Direction.SOUTH);
        //move robots
        R2D2.move();
        C3PO.move();
        R2D2.move();
        C3PO.turnLeft();
        C3PO.move();
        C3PO.turnLeft();
        C3PO.turnLeft();
        C3PO.turnLeft();
        C3PO.move();
        R2D2.turnLeft();
        C3PO.turnLeft();
        C3PO.turnLeft();
        C3PO.turnLeft();
        R2D2.move();
        C3PO.move();
    }
}
