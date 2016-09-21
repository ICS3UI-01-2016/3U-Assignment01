
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City Q5 = new City();
        
        new Wall(Q5,2,3,Direction.NORTH);
        new Wall(Q5,2,3,Direction.EAST);
        new Wall(Q5,2,3,Direction.WEST);
        new Wall(Q5,3,3,Direction.EAST);
        new Wall(Q5,3,3,Direction.SOUTH);
        
        Thing one = new Thing(Q5,0,0);
        one.setColor(Color.BLACK);
        Thing two = new Thing(Q5,1,0);
        two.setColor(Color.BLACK);
        Thing three = new Thing(Q5,1,1);
        three.setColor(Color.BLACK);
        Thing four = new Thing(Q5,1,2);
        four.setColor(Color.BLACK);
        Thing five = new Thing(Q5,2,2);
        five.setColor(Color.BLACK);
        
        RobotSE rick = new RobotSE(Q5,3,3,Direction.EAST);
        rick.setColor(Color.RED);
        rick.setLabel("R");
        
        RobotSE bob = new RobotSE(Q5,0,1,Direction.WEST);
        bob.setColor(Color.RED);
        bob.setLabel("B");
        
        bob.move();
        bob.pickThing();
        rick.turnLeft();
        rick.turnLeft();
        rick.move();
        bob.turnLeft();
        rick.turnRight();
        bob.move();
        bob.pickThing();
        rick.move();
        rick.pickThing();
        bob.turnLeft();
        rick.move();
        bob.move();
        bob.pickThing();
        rick.pickThing();
        rick.turnLeft();
  
    }
}
