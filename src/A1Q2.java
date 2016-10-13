
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shieg0688
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Robot for city
        City Trapistan = new City();
        new Wall(Trapistan, 1, 1, Direction.NORTH);
        new Wall(Trapistan, 1, 2, Direction.NORTH);
        new Wall(Trapistan, 1, 2, Direction.EAST);
        new Wall(Trapistan, 1, 2, Direction.SOUTH);
        new Wall(Trapistan, 1, 1, Direction.WEST);
        new Wall(Trapistan, 2, 1, Direction.WEST);
        new Wall(Trapistan, 2, 1, Direction.SOUTH);
        new Thing(Trapistan, 2, 2);
        //Create robot
        Robot karel = new Robot(Trapistan, 1, 2, Direction.SOUTH);
        //Make robot move
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
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






    }
}