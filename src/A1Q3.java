
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create City for robot
        City Robloxity = new City();
        new Wall(Robloxity, 3, 2, Direction.WEST);
        new Wall(Robloxity, 3, 2, Direction.NORTH);
        new Wall(Robloxity, 2, 3, Direction.WEST);
        new Wall(Robloxity, 1, 3, Direction.WEST);
        new Wall(Robloxity, 1, 3, Direction.NORTH);
        new Wall(Robloxity, 1, 3, Direction.EAST);
        new Wall(Robloxity, 2, 4, Direction.NORTH);
        new Wall(Robloxity, 2, 4, Direction.EAST);
        new Wall(Robloxity, 3, 4, Direction.EAST);
        new Thing(Robloxity, 3, 1);
        //Create Robot
        Robot karel = new Robot(Robloxity, 3, 0, Direction.EAST);
        //Make robot move
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();






    }
}
