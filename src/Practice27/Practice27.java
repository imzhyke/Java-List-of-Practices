/*
 * Title: Practice 27
 * Name: Ezekiel P. Villadolid
 * Description: a program to input two numbers and output their sum.
 * Date: 4/19/2021
 */
package Practice27;

import java.util.Scanner;

public class Practice27 {
    
    //Create a static scanner
    static Scanner thisScans = new Scanner(System.in);
     
    public static void main(String[] args) {
        //Declaration of responce variable
        char response;
        
        //Display Details
        System.out.println("This program adds two numbers.");
        System.out.print("Would you like to run the program Y/y): ");
        //Get the responce
        response = thisScans.next().charAt(0);
        
        // If condition is true
         if(response == 'Y' || response == 'y'){
            do{ //Execute code once.
                
                //get the value of the first num
                System.out.print("Input First Number: ");
                int num1= thisScans.nextInt();
                //get the value of the second num
                System.out.print("Input Second Number: ");
                int num2= thisScans.nextInt();
                //get the sum of num1 and num2
                System.out.println("The Sum Is "+(num1+num2));
                
                //To check if user wants more
                System.out.print("Would you like to run the program Y/y): ");
                response = thisScans.next().charAt(0);
               
                //This will execute again if condition is meet
            }while(response == 'Y' || response == 'y');
         }

    }
    
}
