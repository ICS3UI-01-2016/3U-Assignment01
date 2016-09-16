
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
 * @author ayyaf3300
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create a city
        City NYC = new City();
        
        // create a robot
        Robot dino = new Robot (NYC,0,2,Direction.WEST);
        
        // create walls
        new Wall (NYC,1,2,Direction.EAST);
        new Wall (NYC,2,2,Direction.EAST);
        new Wall (NYC,1,2,Direction.NORTH);
        new Wall (NYC,1,1,Direction.NORTH);
        new Wall (NYC,1,1,Direction.WEST);
        new Wall (NYC,2,1,Direction.WEST);
        new Wall (NYC,2,1,Direction.SOUTH);
        new Wall (NYC,2,2,Direction.SOUTH);
        
        // get dino to move
        int moves = 0;      
        while(moves < 2){
            dino.move();
            moves = moves + 1;
        }
        //get dino to turn left
        dino.turnLeft();    
        
        while(moves < 3){
            dino.move();
            moves = moves + 1;
        }
        dino.turnLeft();
        dino.turnLeft();  
        
        dino.move();
        dino.move();
        dino.move();
        
        dino.turnLeft(); 
        
        dino.move();
        dino.move();
        dino.move();
        
        dino.turnLeft(); 
        
        dino.move();
        }
}

