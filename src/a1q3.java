
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
            new Wall(mtl,3,3,Direction.WEST);
    }
}
