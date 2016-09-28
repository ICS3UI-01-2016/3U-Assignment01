
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
 * @author katop7929
 */
public class whilleloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();  
        Robot karel = new Robot (kw,1,1,Direction.EAST); 
        
        new Wall (kw,1,5,Direction.EAST); 
        
        //while loop with no condotion 
        while (karel.frontIsClear()){ 
            
        }
               
    }
}
