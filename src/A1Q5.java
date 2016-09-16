
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;


/**
 * 16/09/2016
 * A1Q5
 * use 2 robots to collect Things.
 * @author micla1676
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city for the robots
        City Suburbs = new City ();
        
        //create the robots
        Robot Marie = new Robot (Suburbs,0,1,Direction.WEST);
        Robot Karel = new Robot (Suburbs,3,3,Direction.EAST);
        
       //lable Marie
        Marie.setLabel("M");
        
        //lable Karel
         Karel.setLabel("K");
        //set color of Karel
         Karel.setColor(Color.BLUE);
        
        //create the Things (items Karel dropped.
        
        new Thing (Suburbs,0,0);
        new Thing (Suburbs,1,0);
        new Thing (Suburbs,1,1);
        new Thing (Suburbs,1,2);
        new Thing (Suburbs,2,2);
        
        //create walls (Karel's house)
        
        new Wall(Suburbs,2,3,Direction.WEST);
        new Wall(Suburbs,2,3,Direction.NORTH);
        new Wall(Suburbs,2,3,Direction.EAST);
        new Wall(Suburbs,3,3,Direction.EAST);
        new Wall(Suburbs,3,3,Direction.SOUTH);
       
       
        //turn 1 move for karel
        Karel.turnLeft();
        Karel.turnLeft();
        
        //turn 1 move for Marie
        Marie.move();
        Marie.pickThing();
        
        //turn 2 move for karel
        Karel.move();
        
        //turn 2 move for Marie
        Marie.turnLeft();
        
        //turn 3 move for karel
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        
        //turn 3 move for Marie
        Marie.move();
        Marie.pickThing();
        
        //turn 4 move for karel
        Karel.move();
        Karel.pickThing();
        
        //turn 4 move for Marie
        Marie.turnLeft();
        
        //turn 5 move for karel
        Karel.move();
        Karel.pickThing();
        Karel.turnLeft();
        
        //turn 5 move for Marie
        Marie.move();
        Marie.pickThing();
        
        
        
    }
}
