
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tmister911
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        // TODO code application logic here
City derp = new City();
Robot Geo = new Robot (derp,0,3,Direction.WEST);
Wall Wall = new Wall (derp,1,2,Direction.NORTH);
  new Wall (derp,1,3,Direction.NORTH);        
    new Wall (derp,1,2,Direction.WEST);
     new Wall (derp,2,2,Direction.WEST);
     new Wall (derp,2,2,Direction.SOUTH);
     new Wall (derp,2,3,Direction.SOUTH);
     new Wall (derp,2,3,Direction.EAST);
     new Wall (derp,1,3,Direction.EAST);
     Geo.move();
     Geo.move();
     Geo.turnLeft();
      Geo.move();
     Geo.move();
     Geo.move();
     Geo.turnLeft();
     Geo.move();
     Geo.move();
     Geo.move();
     Geo.turnLeft();
      Geo.move();
     Geo.move();
     Geo.move();
     Geo.turnLeft();
     Geo.move();
}
}