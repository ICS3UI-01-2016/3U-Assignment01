
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
 * @author woodc9217
 */
public class a1q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new city
            City mtl = new City();
            //create a robot
            Robot candice = new Robot (mtl,3,0,Direction.EAST);
            //change color of robot
            candice.setColor(Color.black);
            //create a wall
            new Wall(mtl,3,2,Direction.WEST);
            new Wall(mtl,2,3,Direction.WEST);
            new Wall(mtl,1,3,Direction.WEST);
            new Wall(mtl,1,3,Direction.EAST);
            new Wall(mtl,1,3,Direction.NORTH);
            new Wall(mtl,3,2,Direction.NORTH);
            new Wall(mtl,2,4,Direction.NORTH);
            new Wall(mtl,2,4,Direction.EAST);
            new Wall(mtl,3,4,Direction.EAST);
            //place flag (thing)
            new Thing(mtl,3,1);
            //get candice to climb mountain with flag
            candice.move();
            candice.pickThing();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.move();
            candice.move();
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.putThing();
            //get candice to go down the mountain
            candice.move();
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.move();
            candice.turnLeft();
            
    }
}
