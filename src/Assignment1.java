
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
 * @author macdt8987
 */
public class Assignment1 {
  
  
  
    public static void main(String[] args) {
        //create a city for the robot
        City xxx = new City();
        //create a robot
        Robot qtazn = new Robot (xxx,0,2,Direction.WEST);
        //walls
        new Wall (xxx,1,2,Direction.EAST);
        new Wall (xxx,1,2,Direction.NORTH);
        new Wall (xxx,1,1,Direction.NORTH);
        new Wall (xxx,1,1,Direction.WEST);
        new Wall (xxx,2,1,Direction.WEST);
        new Wall (xxx,2,1,Direction.SOUTH);
        new Wall (xxx,2,2,Direction.SOUTH);
        new Wall (xxx,2,2,Direction.EAST);
        //Make the Robot move
        qtazn.move();
        
        qtazn.move();
        qtazn.turnLeft();
        qtazn.move();
        qtazn.move();
        qtazn.move();
        qtazn.turnLeft();
        qtazn.move();
        qtazn.move();
        qtazn.move();
        qtazn.turnLeft();
        qtazn.move();
        qtazn.move();
        qtazn.move();
        qtazn.turnLeft();
        qtazn.move();
    }
}
