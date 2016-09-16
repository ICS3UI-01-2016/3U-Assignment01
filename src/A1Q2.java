
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
 * @author awadb3223
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // create a city
    City Kitchener = new City();
    
    //create a robot
    Robot Bob = new Robot(Kitchener,1,2,Direction.SOUTH);
    
    //Create walls
    new Wall(Kitchener,1,1,Direction.NORTH);
  new Wall(Kitchener,1,2,Direction.NORTH);
  new Wall(Kitchener,1,1,Direction.WEST);
  new Wall(Kitchener,2,1,Direction.WEST);
  new Wall(Kitchener,2,1,Direction.SOUTH);
  new Wall(Kitchener,1,2,Direction.SOUTH);
   new Wall(Kitchener,1,2,Direction.EAST);
   
   //Make a thing
   new Thing(Kitchener,2,2);
   
   //Make Bob move to thing
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.move();
   Bob.turnLeft();
   Bob.move();
   Bob.turnLeft();
   Bob.move();
   
   //Make Bob pickup thing
   Bob.pickThing();
   
   //Make Bob Go Back
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.move();
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.move();
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.move();
   Bob.turnLeft();
   Bob.turnLeft();
   Bob.turnLeft();
   
    }
}
