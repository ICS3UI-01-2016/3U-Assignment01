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
         Chen. move();
         Chen. turnLeft();
         Chen.move();
         
         Suho. move();
         Suho. turnLeft();
         Suho. move();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. move();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. turnLeft();
         Suho. move();
         
    }
}
