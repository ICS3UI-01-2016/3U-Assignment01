
 import becker.robots.City;
 import becker.robots.Direction;
 import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;
 
 /*
  * 16/09/2016
  * A1Q4 with threading
  * get two robots to meet.
  * @author micla1676
  */
 public class A1Q4Treading {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         // create the city
         City Maze = new City();
         // create the robots
         // they need to have the keyword 'final' infront for this to work
         final Robot Mazenav1 = new Robot(Maze, 0, 0, Direction.SOUTH);
         final Robot Mazenav2 = new Robot(Maze, 0, 1, Direction.SOUTH);
 
         //lable Mazenav1
        Mazenav1.setLabel("M1");
        
        //lable Mazenav2
        Mazenav2.setLabel("M2");
        //set color of mark
        Mazenav2.setColor(Color.BLUE);
        //change speed for Mazenav2
        Mazenav2.setSpeed(5.8);
         
         //create walls in Maze
        new Wall(Maze,0,1,Direction.WEST);
        new Wall(Maze,1,1,Direction.WEST);
        new Wall(Maze,1,1,Direction.SOUTH);
        
        
            
         // A thread that determines Mazenav1's movements
         Thread Mazenav1Thread = new Thread(new Runnable() {
             
             // what karel should be doing
             @Override
             public void run() {
                 Mazenav1.move();
                 Mazenav1.move();
                 Mazenav1.turnLeft();
                 Mazenav1.move();
             }
         });
         
         // A thread that determines Mazenav2's movements
         Thread Mazenav2Thread = new Thread(new Runnable() {
             
             // what Jeff should be doing
             @Override
             public void run() {
                Mazenav2.move();
                Mazenav2.turnLeft();
                Mazenav2.move();
                Mazenav2.turnLeft();
                Mazenav2.turnLeft();
                Mazenav2.turnLeft();
                Mazenav2.move();
                Mazenav2.turnLeft();
                Mazenav2.turnLeft();
                Mazenav2.turnLeft();
                Mazenav2.move();
             }
         });
 
         // tell both threads to start running
         Mazenav1Thread.start();
         Mazenav2Thread.start();
     }
 
 }