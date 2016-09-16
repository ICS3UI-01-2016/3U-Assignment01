
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
         City a1q5 = new City();
        // Create robots
         final Robot maria = new Robot(a1q5,0,1,Direction.WEST);
         final Robot karel = new Robot(a1q5,3,3,Direction.EAST);
        // labels
         maria.setLabel("M"); 
         karel.setLabel("K"); 
        // create things
         Thing t;  
            t = new Thing(a1q5,0,0);
            t = new Thing(a1q5,1,0);
            t = new Thing(a1q5,1,1);
            t = new Thing(a1q5,1,2);
            t = new Thing(a1q5,2,2);
            t.setColor(Color.cyan);
          // A thread that determines karel's movements
        Thread karelThread = new Thread(new Runnable() {
            
            // what karel should be doing
            @Override
            public void run() {
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.pickThing();
                karel.move();
                karel.turnLeft();
                karel.pickThing();
            }
        });
        
        // A thread that determines maria's movements
        Thread mariaThread = new Thread(new Runnable() {
            
            // what maria should be doing
            @Override
            public void run() {
                maria.move();
                maria.turnLeft();
                maria.pickThing();
                maria.move();
                maria.pickThing();
                maria.turnLeft();
                maria.move();
                maria.pickThing();
                
            }
        });

        // tell both threads to start running
        karelThread.start();
        mariaThread.start();
        
            
            
    }
}
