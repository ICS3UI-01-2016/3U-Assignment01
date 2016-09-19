
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tmister911
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City f = new City();
        Robot Geo = new Robot(f,0,0,Direction.SOUTH);
        Robot Bob = new Robot (f,0,1,Direction.SOUTH);
        Wall Wall = new Wall (f,0,1,Direction.WEST);  
        new Wall (f,1,1,Direction.WEST);
        new Wall (f,1,1,Direction.SOUTH);
        Geo.move();
        Bob.move();
        Geo.move();
        Bob.turnLeft();
      Geo.turnLeft();
      Bob.move();
      Bob.turnLeft();
      Bob.turnLeft();
      Bob.turnLeft();
      Bob.move();
      Geo.move();
      Bob.turnLeft();
      Bob.turnLeft();
      Bob.turnLeft();
      Bob.move();
      
      
    }
    
}
