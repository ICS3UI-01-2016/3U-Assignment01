
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Candice
 */
public class a1q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
            City mtl = new City();
            //create a robot
            Robot karel = new Robot (mtl,3,3,Direction.EAST);
            //change color of robot
            karel.setColor(Color.white);
            //label karel
            karel.setLabel("k");
            //create a robot
            Robot maria = new Robot (mtl,0,1,Direction.WEST);
            //change color of robot
            maria.setColor(Color.white);
            //label maria
            maria.setLabel("m");
            //create walls
            new Wall(mtl,2,3,Direction.EAST);
            new Wall(mtl,3,3,Direction.EAST);
            new Wall(mtl,2,3,Direction.WEST);
            new Wall(mtl,2,3,Direction.NORTH);
            new Wall(mtl,3,3,Direction.SOUTH);
            //Place things
            new Thing(mtl,0,0);
            new Thing(mtl,1,0);
            new Thing(mtl,1,1);
            new Thing(mtl,1,2);
            new Thing(mtl,2,2);
            //instruct maria
            maria.move();
            maria.pickThing();
            //instruct karel
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            //instruct maria
            maria.turnLeft();
            maria.move();
            //instruct karel
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            //instruct maria
            maria.pickThing();
            //instruct karel
            karel.pickThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            //instruct maria
            maria.turnLeft();
            //instruct karel
            karel.move();
            karel.turnLeft();
            //instruct maria
            maria.move();
            maria.pickThing();
            //instruct karel
            karel.pickThing();
            
            
    }
    
}
