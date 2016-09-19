
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city for robot
        City to = new City();
        //create a robot
        Robot karel = new Robot(to,3,3,Direction.EAST);
        Robot maria = new Robot(to,0,1,Direction.WEST);

        //create walls
         new Wall(to,2,3,Direction.WEST);
         new Wall(to,2,3,Direction.NORTH);
         new Wall(to,2,3,Direction.EAST);
         new Wall(to,3,3,Direction.EAST);
         new Wall(to,3,3,Direction.SOUTH);
         
         //set labels
         karel.setLabel("K");
         karel.setColor(Color.GREEN);
         maria.setLabel("M");
         maria.setColor(Color.ORANGE);
         
         //get robots to move
         new Thing(to,0,0);
         new Thing(to,1,0);
         new Thing(to,1,1);
         new Thing(to,1,2);
         new Thing(to,2,2);
         
         maria.move();
         maria.pickThing();
         maria.turnLeft();
         maria.move();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         karel.pickThing();
         maria.pickThing();
         maria.turnLeft();
         karel.move();
         karel.pickThing();
         karel.turnLeft();
         maria.move();
         maria.pickThing();
    
    }
}
