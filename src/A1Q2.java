
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/** 16/09/2016
 *A1Q2
 * Write a program to make robot collect the thing.
 * @author micla1676
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for the robot.
        City CityofTrees = new City ();
        
        //create the robot
        Robot karel = new Robot (CityofTrees,1,2,Direction.SOUTH);
       
        //lable karel
        karel.setLabel("K");
       
        //create thing a.k.a "Newspaper"
        new Thing (CityofTrees,2,2);
        
        //create walls in the city
        new Wall (CityofTrees,1,2,Direction.EAST);
        new Wall (CityofTrees,2,1,Direction.SOUTH);
        new Wall (CityofTrees,1,2,Direction.NORTH);
        new Wall (CityofTrees,2,1,Direction.WEST);
        new Wall (CityofTrees,1,1,Direction.WEST);
        new Wall (CityofTrees,1,1,Direction.NORTH);
        new Wall (CityofTrees,1,2,Direction.SOUTH);
        
        //get the robot to move around the walls towards thing
        
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        
        //get karel to pick up "Newspaper"
        karel.pickThing();
        
        //get karel back to starting position
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        //get karel to drop newspaper and read it
        
        karel.putThing();
        
             
    }
    }
   
