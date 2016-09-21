
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
 * @author dhimm3399
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city of the robot
      City On = new City();
      // create a robot 
      Robot Krina = new Robot (On,2,2,Direction.SOUTH);
     
     //create walls 
      new Wall(On,3,3,Direction.WEST);
      new Wall(On,4,3,Direction.WEST);
      new Wall(On,3,3,Direction.NORTH);
      new Wall(On,3,4,Direction.NORTH);
      new Wall(On,3,4,Direction.EAST);
      new Wall(On,4,4,Direction.EAST);
      new Wall(On,4,4,Direction.SOUTH);
      new Wall(On,4,3,Direction.SOUTH);
   
      
       
    
      Krina.move();
      Krina.move();
      Krina.move();
      Krina.turnLeft();
      Krina.move();
      Krina.move();
      Krina.move();
      Krina.turnLeft();
      Krina.move();
      Krina.move();
      Krina.move();
      Krina.turnLeft();
      Krina.move();
      Krina.move();
      Krina.move();
      Krina.turnLeft();
     
      
   
     
      
              
            
    
    
    }

    private static void Wall(City On, int i, int i0, Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
      
      
      


