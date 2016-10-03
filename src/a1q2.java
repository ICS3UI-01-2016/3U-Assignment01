
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
public class a1q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a new city
            City mtl = new City();
            //create a robot
            Robot candice = new Robot (mtl,1,2,Direction.SOUTH);
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
            new Wall(mtl,1,2,Direction.EAST);
            //create a wall
            new Wall(mtl,1,2,Direction.SOUTH);
            //create a wall
            new Wall(mtl,2,1,Direction.SOUTH);
            //place a thing: "newspaper"
            new Thing(mtl,2,2);
            //get candice out of bed
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.move();
            //get candice to pick up the newspaper
            candice.pickThing();
            //get candice to go back to bed with newspaper
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            candice.move();
            candice.turnLeft();
            candice.turnLeft();
            candice.turnLeft();
            
    }
}
