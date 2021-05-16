/*
 * Title: Practice 27
 * Name: Ezekiel P. Villadolid
 * Description: a program to input two numbers and output their sum.
 * Date: 4/19/2021
 */
package Practice27;

import java.util.Scanner;

public class Practice27 {
    
    static Scanner thisScans = new Scanner(System.in);
     
    public static void main(String[] args) {
        char response;
    
        System.out.println("This program adds two numbers.");
        System.out.print("Would you like to run the program Y/y): ");
        response = thisScans.next().charAt(0);
        
         if(response == 'Y' || response == 'y'){
            do{ 
                System.out.print("Input First Number: ");
                int num1= thisScans.nextInt();
                
                System.out.print("Input Second Number: ");
                int num2= thisScans.nextInt();
                
                System.out.println("The Sum Is "+(num1+num2));
                
                System.out.print("Would you like to run the program Y/y): ");
                response = thisScans.next().charAt(0);
                
                
            }while(response == 'Y' || response == 'y');
         }

    }
    
}
