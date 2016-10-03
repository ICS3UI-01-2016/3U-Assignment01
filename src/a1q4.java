
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class a1q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
            City mtl = new City();
            //create a robot
            Robot candice = new Robot (mtl,0,0,Direction.SOUTH);
            //change color of robot
            candice.setColor(Color.black);
            //create another robot
            Robot mike = new Robot (mtl,0,1,Direction.SOUTH);
            //change color of other robot
            mike.setColor(Color.black);
            //create a wall
            new Wall(mtl,0,1,Direction.WEST);
            new Wall(mtl,1,1,Direction.WEST);
            new Wall(mtl,1,1,Direction.SOUTH);
            //instruct mike
            mike.move();
            mike.turnLeft();
            mike.move();
            //instruct candice
            candice.move();
            //instruct mike
            mike.turnLeft();
            mike.turnLeft();
            //instruct candice
            candice.move();
            //instruct mike
            mike.turnLeft();
            //instruct candice
            candice.turnLeft();
            //instruct mike
            mike.move();
            mike.turnLeft();
            mike.turnLeft();
            mike.turnLeft();
            //instruct candice
            candice.move();
            //instruct mike
            mike.move();
            
            
    }
    
}
