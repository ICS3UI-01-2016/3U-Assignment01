
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A1Q2 {
//Make a program to move robot around walls

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City km = new City();
        //create a robot
        Robot karel = new Robot(km,1,2,Direction.SOUTH);
        //put newspaper on ground
        new Thing (km,2,2);
        //make wall inbetween karel's route to newspaper
        new Wall(km,1,2,Direction.EAST);
        new Wall(km,2,1,Direction.SOUTH);
        new Wall(km,1,2,Direction.NORTH);
        new Wall(km,1,1,Direction.NORTH);
        new Wall(km,1,2,Direction.SOUTH);
        new Wall(km,1,1,Direction.WEST);
        new Wall(km,2,1,Direction.WEST);
        //get karel to get newspaper
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.move();
       //pick up newspaper
       karel.pickThing();
       //head back home
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       
       
       
       
       
       
    }}
