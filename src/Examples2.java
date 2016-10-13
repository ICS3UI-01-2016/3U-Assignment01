
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class Examples2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input  = new Scanner(System.in);
        //ask user for name
        System.out.println("what's ur name shawty");
        //get the name from the user
        String name = input.nextLine();
        //say hello 
        System.out.println("hit my lineee " + name);
        //ask for birth year
        System.out.println("what year you born");
        int birthyear = input.nextInt();
        //calculate age
        int age = 2016 - birthyear;
        //tell user name
        System.out.println("you're " + age + " young blood");
        if(age >18){
            System.out.println("too old");
            
        }
        
    }
}
