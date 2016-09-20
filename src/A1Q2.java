
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
 * @author vandl4973
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City SE = new City();
         Robot eiva = new Robot (SE,1,2,Direction.SOUTH);
         new Wall (SE,1,2,Direction.NORTH);
         new Wall (SE,1,1,Direction.NORTH);
         new Wall (SE,1,1,Direction.WEST);
         new Wall (SE,2,1,Direction.WEST);
         new Wall (SE,2,1,Direction.SOUTH);
         new Wall (SE,1,2,Direction.SOUTH);
         new Wall (SE,1,2,Direction.EAST);
         new Thing(SE,2,2);
        eiva.turnLeft();eiva.turnLeft();eiva.turnLeft();
        eiva.move(); eiva.turnLeft(); eiva.move(); eiva.turnLeft();
         eiva.move();
         eiva.turnLeft();eiva.turnLeft();
         eiva.pickThing();
         eiva.move();eiva.turnLeft();eiva.turnLeft();eiva.turnLeft();
         eiva.move();eiva.turnLeft();eiva.turnLeft();eiva.turnLeft();
         eiva.move();eiva.turnLeft();eiva.turnLeft();eiva.turnLeft();
    }
}
