
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //A1Q2
        City SK = new City();
        
        //create Walls
        new Wall (SK, 7,7, Direction. NORTH);
        new Wall (SK, 7,6, Direction. NORTH);
        new Wall (SK, 7,6, Direction. WEST);
                
    }
}
