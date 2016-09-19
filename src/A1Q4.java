
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
 * @author awadb3223
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a City
        City village = new City ();
        
        //Create the 2 robots
        Robot bill = new Robot (village,0,0,Direction.SOUTH);
        Robot steve = new Robot (village,0,1,Direction.SOUTH);
        
        //Make the walls
        new Wall (village,0,1,Direction.WEST);
        new Wall (village,1,1,Direction.WEST);
        new Wall (village,1,1,Direction.SOUTH);
        
        //Make Bill move
        bill.move();
        bill.move();
        bill.turnLeft();
        bill.move();
        
        //Make Steve Move
        steve.move();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        
        
      
    }
}
