
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
 * @author fabed2976
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         City SK = new City();
         Robot Chen = new Robot (SK, 0,0, Direction. SOUTH);
         Robot Suho = new Robot (SK, 0,1, Direction. SOUTH);
         
         new Wall (SK, 0,1, Direction. WEST);
         new Wall (SK, 1,1, Direction. WEST);
         new Wall (SK, 1,1, Direction. SOUTH);
         
         Chen. move();
         Suho. move();
         Chen. move();
         Suho. turnLeft();
         Chen. turnLeft();
         Suho. move();
         Chen.move();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. move();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. move();
         
