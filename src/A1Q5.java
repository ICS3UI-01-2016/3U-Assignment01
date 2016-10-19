
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
        City kl = new City();
        Robot bob = new Robot (kl, 0, 2, Direction.WEST);
        Robot job = new Robot (kl, 3, 4, Direction.WEST);
        
        //Create Walls
        new Wall(kl, 2, 4, Direction.WEST);
        new Wall(kl, 2, 4, Direction.EAST);
        new Wall(kl, 2, 4, Direction.NORTH);
        new Wall(kl, 3, 4, Direction.EAST);
        new Wall(kl, 3, 4,Direction.SOUTH);
        new Thing(kl, 0, 1,Direction.EAST);
        new Thing(kl, 1, 1,Direction.EAST);
        new Thing(kl, 1, 2,Direction.EAST);
        new Thing(kl, 1, 3,Direction.EAST);
        new Thing(kl, 2, 3,Direction.EAST);
        
        //Get bob to move down in a 'C' shape while picking all of the things that in its path.
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        
        //Get job to move outside of the walls and turn right 
        job.move();
        job.turnLeft();
        job.turnLeft();
        job.turnLeft();
        // Get job to move and turn right while picking all of the things in its path.
        job.move();
        job.pickThing();
        job.move();
        job.pickThing();
        job.turnLeft();
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
                
        
    }
}
