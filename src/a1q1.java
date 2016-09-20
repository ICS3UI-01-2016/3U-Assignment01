
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new city
            City mtl = new City();
            //create a robot
            Robot candice = new Robot (mtl,0,2,Direction.WEST);
            //change color of robot
            candice.setColor(Color.black);
            //create a wall
            new Wall(mtl,1,1,Direction.WEST);
            //create a wall
            new Wall(mtl,2,1,Direction.WEST);
            //create a wall
            new Wall(mtl,1,1,Direction.NORTH);
            //create a wall
            new Wall(mtl,1,2,Direction.NORTH);
             //create a wall
            new Wall(mtl,2,2,Direction.EAST);
            //create a wall
            new Wall(mtl,1,2,Direction.EAST);
             //create a wall
            new Wall(mtl,2,2,Direction.SOUTH);
            //create a wall
            new Wall(mtl,2,1,Direction.SOUTH);
            //get candice to move
            candice.move();
            candice.move();
            //get candice to turn left
            candice.turnLeft();
            //get candice to move
            candice.move();
            candice.move();
            candice.move();
            //get candice to turn left
            candice.turnLeft();
            //get candice to move
            candice.move();
            candice.move();
            candice.move();
            //get candice to start position
            candice.turnLeft();
            candice.move();
            candice.move();
            candice.move();
            candice.turnLeft();
            candice.move();
            
            
            
           
            
            
            
          
            
    }
}
