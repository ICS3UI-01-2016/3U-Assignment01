
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City k = new City(); 
        Robot Geo = new Robot (k,3,0,Direction.EAST);
        Thing Thing = new Thing (k,3,1);
        Wall Wall = new Wall (k,3,2,Direction.WEST);
        new Wall (k,3,2,Direction.NORTH);
        new Wall (k,2,3,Direction.WEST);
        new Wall (k,1,3,Direction.WEST);
        new Wall (k,1,3,Direction.NORTH);
        new Wall (k,1,3,Direction.EAST);
        new Wall (k,2,4,Direction.NORTH);
       new Wall (k,3,4,Direction.EAST); 
         new Wall (k,2,4,Direction.EAST); 
        Geo.move();
        Geo.pickThing();
        Geo.turnLeft();
        Geo.move();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.move();
        Geo.turnLeft();
        Geo.move();
        Geo.move();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.move();
        Geo.putThing();
        Geo.move();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.move();
        Geo.turnLeft();
        Geo.move();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.turnLeft();
        Geo.move();
        Geo.move();
         Geo.turnLeft();
    
        
        
        
    }

    }
    

