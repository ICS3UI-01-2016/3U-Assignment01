
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.jar.Attributes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City kpl = new City (); 
        
        // create a robot
        Robot obama = new Robot(kpl,0,1,Direction.WEST);
        
        //give robot initials 
        obama.setLabel("M"); 
        
        //create a robot 
        Robot trump = new Robot(kpl,3,3,Direction.EAST);
        
        //give robot initials
        trump.setLabel("K"); 
       
        //create a wall
        new Wall(kpl,2,3,Direction.WEST);
        new Wall(kpl,2,3,Direction.NORTH);
        new Wall(kpl,2,3,Direction.EAST);
        new Wall(kpl,3,3,Direction.EAST);
        new Wall(kpl,3,3,Direction.SOUTH);
        
        //Make Thing 
        new Thing(kpl,0,0);  
        new Thing(kpl,1,0); 
        new Thing(kpl,1,1);
        new Thing(kpl,1,2);
        new Thing(kpl,2,2);
        
        //get both both robots to move 
        obama.move();
        obama.pickThing();
        obama.turnLeft();
        trump.turnLeft(); 
        trump.turnLeft();
        trump.move();
        obama.move();
        obama.pickThing(); 
        trump.turnLeft();
        trump.turnLeft();
        trump.turnLeft();
        trump.move();
        trump.pickThing();
        obama.turnLeft();
        obama.move();
        trump.move();
        trump.pickThing();
        obama.pickThing();
        trump.turnLeft();        
    }
}
