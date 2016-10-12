
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
 * @author khans4349
 */
public class Whileloop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();
        
        // create a robot
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        
        // create a wall
        new Wall(kw,1,5,Direction.EAST);
        
        // create a thing
        new Thing(kw,1,3);
  
        // while loop with no condition
        while(karel.frontIsClear()){
            
            // move the robot
            karel.move();
            
            // check for something to pick up
            if(karel.canPickThing()){
                karel.pickThing();
                
            }
        }
        // end of loop
        // turn the robot around
        karel.turnLeft();
        karel.turnLeft();
        
        // go home karel
        while(karel.frontIsClear()){
            karel.move();
            // if one avenue 1
            if(karel.getAvenue()== 1 && karel.getStreet() == 1){
                //stop the loop
                break;
            }else if(!karel.frontIsClear()){
                
            }else{
                karel.move();
            }
        }
        
    }
}
