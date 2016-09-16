
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
 * @author awadb3223
 */
public class A1Q1 {
   
    
    public static void main(String[] args) {
         // create a city
    City Kitchener = new City();
    
    //create a robot
    Robot Bob = new Robot(Kitchener,0,2,Direction.WEST);
    
    //create walls
    new Wall(Kitchener,1,1,Direction.NORTH);
  new Wall(Kitchener,1,2,Direction.NORTH);
  new Wall(Kitchener,1,1,Direction.WEST);
  new Wall(Kitchener,2,1,Direction.WEST);
  new Wall(Kitchener,2,1,Direction.SOUTH);
  new Wall(Kitchener,2,2,Direction.SOUTH);
  new Wall(Kitchener,1,2,Direction.EAST);
  new Wall(Kitchener,2,2,Direction.EAST);
  
  // Make Bob Move
  int moves = 1;
        
        while(moves < 4){
       Bob.move();
       Bob.move();
        Bob.turnLeft();
        Bob.move();
        
    }
            
}
}
