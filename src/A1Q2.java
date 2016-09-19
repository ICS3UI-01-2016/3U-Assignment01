
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City hi = new City();
        Robot Boi = new Robot(hi,1,2,Direction.SOUTH);
        Wall Wall = new Wall (hi,1,2,Direction.EAST);
        new Wall (hi,1,2,Direction.SOUTH);
        new Wall (hi,1,2,Direction.NORTH);
        new Wall (hi,1,1,Direction.NORTH);
        new Wall (hi,2,1,Direction.WEST);
        new Wall (hi,1,1,Direction.WEST);
       new Wall (hi,2,1,Direction.SOUTH);
        Thing Thing = new Thing (hi,2,2);
        Boi.turnLeft();
         Boi.turnLeft();
         Boi.turnLeft(); 
        Boi.move();
        Boi.turnLeft();
        Boi.move();
        Boi.turnLeft();
        Boi.move();
       Boi.pickThing();
       Boi.turnLeft();
       Boi.turnLeft();
       Boi.move();
       Boi.turnLeft();
         Boi.turnLeft(); 
         Boi.turnLeft();
        Boi.move();
        Boi.turnLeft();
         Boi.turnLeft();
         Boi.turnLeft();
        Boi.move();
        Boi.turnLeft();
         Boi.turnLeft(); 
         Boi.turnLeft();
        
        
        
        
        // TODO code application logic here
    }
    
}
