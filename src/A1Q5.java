

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
 * @author David
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City SK = new City();
        Robot Chen = new Robot (SK, 4,3, Direction. EAST);
        Robot Suho = new Robot (SK, 1,1, Direction. WEST);
        
        new Wall (SK, 3,3, Direction. WEST);
        new Wall (SK, 3,3, Direction. NORTH);
        new Wall (SK, 3,3, Direction. EAST);
        new Wall (SK, 4,3, Direction. EAST);
        new Wall (SK, 4,3, Direction. SOUTH);
        new Thing (SK, 3,2);
        new Thing (SK, 2,2);
        new Thing (SK, 2,1);
        new Thing (SK, 2,0);
        new Thing (SK, 1,0);
       
        //Get Suho to move
        Suho. move();
        Suho. pickThing();
        Suho. turnLeft();
        Suho. move();
        Suho. pickThing();
        Suho.turnLeft();
        Suho. move();
        Suho. pickThing();
        Suho. move ();
        Suho. pickThing();
        Suho.turnLeft();
        Suho.turnLeft();
        Suho.turnLeft();
        Suho. move();
        Suho. pickThing();
        Suho. turnLeft();
        Suho. turnLeft();
        Suho.move();
        Suho.turnLeft();
        Suho.move();
        Suho.turnLeft();
        Suho.turnLeft();
        
        
         //get Chen to meet suho
        Chen.turnLeft();
        Chen.turnLeft();
        Chen.move();
        Chen. turnLeft();
        Chen. turnLeft();
        Chen. turnLeft();
        Chen. move();
        Chen.move();
        Chen.turnLeft();
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
