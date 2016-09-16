
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
 * @author messr2578
 */
public class A1_q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //created integers
        int moves = 0;
        
        //create a city for the robot
        City kw = new City();
        
        //create a robot facing east
        Robot Karel = new Robot(kw,3,3,Direction.EAST);
        Robot Maria = new Robot(kw,0,1,Direction.WEST);
        //label the robots
        Karel.setLabel("K");
        Maria.setLabel("M");
        
        // create walls
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,2,3,Direction.NORTH);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,3,3,Direction.EAST);
        new Wall(kw,3,3,Direction.SOUTH);
        new Thing(kw,0,0);
        new Thing(kw,1,0);
        new Thing(kw,1,1);
        new Thing(kw,1,2);
        new Thing(kw,2,2);
        
        //move both the robots to collect the dropped groceries
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Maria.move();
        Maria.pickThing();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.pickThing();
        Maria.turnLeft();
        Karel.move();
        Maria.move();
        Maria.pickThing();
        Karel.pickThing();
        Maria.turnLeft();
        Karel.turnLeft();
        Maria.move();
        Maria.pickThing();
    }
}
