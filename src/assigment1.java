
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class assigment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City SA = new City();
        new Wall (SA,2,1,Direction.WEST);
        new Wall (SA,3,1,Direction.WEST);
        new Wall (SA,3,2,Direction.SOUTH);
        new Wall (SA,3,1,Direction.SOUTH);
        new Wall (SA,3,2,Direction.EAST);
        new Wall (SA,2,2,Direction.EAST);
        new Wall (SA,2,1,Direction.NORTH);
        new Wall (SA,2,2,Direction.NORTH);
        Robot wallie = new Robot (SA,1,1,Direction.WEST); 
    }
}

