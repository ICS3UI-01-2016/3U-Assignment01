
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
 * @author messr2578
 */
public class A1_q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREATE INTEGERS
        int Rotate = 0;
        //create a city for the robot
        City kw = new City();
        //create a robot facing east
        Robot Hans = new Robot(kw,0,2,Direction.WEST);
        // create walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,1,Direction.SOUTH);
        
        //move robot
        Hans.move();
        Hans.move();
        Hans.turnLeft();
        while(Rotate < 3){
        Hans.move();
        Hans.move();
        Hans.move();
        Hans.turnLeft();
        Rotate = Rotate + 1;
    }
        Hans.move();
    }
}
