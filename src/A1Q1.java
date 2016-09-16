
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/** 15/09/2016
 *A1Q1
 * Write a program to make robot go around a wall.
 * @author micla1676
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for the robot.
        City CityofTrees = new City ();
        
        //create the robot
        Robot forestrobot = new Robot (CityofTrees,0,3,Direction.WEST);
        
        //create walls in the city
        new Wall (CityofTrees,2,2,Direction.EAST);
        new Wall (CityofTrees,1,2,Direction.EAST);
        new Wall (CityofTrees,2,1,Direction.SOUTH);
        new Wall (CityofTrees,2,2,Direction.SOUTH);
        new Wall (CityofTrees,2,1,Direction.WEST);
        new Wall (CityofTrees,1,1,Direction.WEST);
        new Wall (CityofTrees,1,1,Direction.NORTH);
        new Wall (CityofTrees,1,2,Direction.NORTH);
        
        //get the robot to move around the walls
        //create a variable to stop movement
        int moves = 0;
        while (moves < 100) {
            forestrobot.move();
            forestrobot.move();
            forestrobot.move();
            forestrobot.turnLeft();
            moves = moves + 1;     
    }
    }
}

