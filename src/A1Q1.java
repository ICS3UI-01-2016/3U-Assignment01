
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
 * @author shieg0688
 */
public class A1Q1 {

    public static void main(String[] args) {
        //Create city for robot
        City NYC = new City();
        new Wall(NYC, 1, 1, Direction.NORTH);
        new Wall(NYC, 1, 2, Direction.NORTH);
        new Wall(NYC, 1, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.WEST);
        new Wall(NYC, 2, 1, Direction.SOUTH);
        new Wall(NYC, 2, 2, Direction.SOUTH);
        new Wall(NYC, 1, 2, Direction.EAST);
        new Wall(NYC, 2, 2, Direction.EAST);
        //Create robot
        Robot karel = new Robot(NYC, 0, 2, Direction.WEST);
        //Make robot move
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();


    }
}
