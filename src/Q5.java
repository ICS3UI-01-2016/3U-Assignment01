
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
 * @author ANNT0773
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw=new City();
                Robot a=new Robot(kw,0,1,Direction.WEST);
                Robot b=new Robot(kw,3,3,Direction.EAST);
        
        new Thing(kw,0,0);
        new Thing(kw,1,0);
        new Thing(kw,1,1);
        new Thing(kw,1,2);
        new Thing(kw,2,2);
        
        new Wall(kw,2,3,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,3,3,Direction.EAST);
        new Wall(kw,3,3,Direction.SOUTH);
        
        a.canPickThing();
        b.canPickThing();
        a.move();
        b.turnLeft();
        b.turnLeft();
        b.move();
        a.pickThing();
        b.turnLeft();
        b.turnLeft();
        b.turnLeft();
        a.turnLeft();
        b.move();
        b.pickThing();
        a.move();
        a.pickThing();
        a.turnLeft();
        a.move();
        a.pickThing();
        b.move();
        b.pickThing();
        b.turnLeft();
        
        
        
        // TODO code application logic here
    }
}
