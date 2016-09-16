
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**16/09/2016
 * A1Q4
 * get two robots to meet at the same time
 * @author micla1676
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for the robot
         City Maze = new City ();
         
        //create the robots
        Robot Mazenav1 = new Robot (Maze,0,0,Direction.SOUTH);
        Robot Mazenav2 = new Robot (Maze,0,1,Direction.SOUTH);
        
        //lable Mazenav1
        Mazenav1.setLabel("M1");
        
        //lable Mazenav2
        Mazenav2.setLabel("M2");
        //set color of mark
        Mazenav2.setColor(Color.BLUE);
        
        //create walls in Maze
        new Wall(Maze,0,1,Direction.WEST);
        new Wall(Maze,1,1,Direction.WEST);
        new Wall(Maze,1,1,Direction.SOUTH);
        
        //turn 1 movements for Mazenav1
        
    }
}
