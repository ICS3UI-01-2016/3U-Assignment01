
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for robot
        City af = new City();
        // create a robot
        Robot maria = new Robot(af,0,1,Direction.WEST);
        Robot karel = new Robot(af,3,3,Direction.EAST);
        
        // get jeff to move
        karel.setLabel("K");
        maria.setLabel("M");
        
        // create expensive items
        new Thing(af,0,0);
        new Thing(af,1,0);
        new Thing(af,1,1);
        new Thing(af,1,2);
        new Thing(af,2,2);
        
        // create karel's home
        new Wall(af,3,3,Direction.SOUTH);
        new Wall(af,3,3,Direction.EAST);
        new Wall(af,2,3,Direction.NORTH);
        new Wall(af,2,3,Direction.WEST);
        new Wall(af,2,3,Direction.EAST);
        
        // make maria pick expensive items
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        // make karel pick expensive items
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
      
    }
}
