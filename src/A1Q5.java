
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
 * @author gavra1870
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City for robot
        City Kl = new City();
        Robot Bob = new Robot (Kl, 0, 2, Direction.WEST);
        Robot Job = new Robot (Kl, 3, 4, Direction.WEST);
        
        //Create Walls
        new Wall(Kl, 2, 4, Direction.WEST);
        new Wall(Kl, 2, 4, Direction.EAST);
        new Wall(Kl, 2, 4, Direction.NORTH);
        new Wall(Kl, 3, 4, Direction.EAST);
        new Wall (Kl, 3, 4,Direction.SOUTH);
        new Thing(Kl, 0, 1,Direction.EAST);
        new Thing(Kl, 1, 1,Direction.EAST);
        new Thing(Kl, 1, 2,Direction.EAST);
        new Thing(Kl, 1, 3,Direction.EAST);
        new Thing(Kl, 2, 3,Direction.EAST);
        
        //Get Bob to move
        Bob.move();
        Bob.pickThing();
        Bob.turnLeft();
        Bob.move();
        Bob.pickThing();
        Bob.turnLeft();
        Bob.move();
        Bob.pickThing();
        
        //Get Job to move 
        Job.move();
        Job.turnLeft();
        Job.turnLeft();
        Job.turnLeft();
        Job.move();
        Job.pickThing();
        Job.move();
        Job.pickThing();
        Job.turnLeft();
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
                
        
    }
}
