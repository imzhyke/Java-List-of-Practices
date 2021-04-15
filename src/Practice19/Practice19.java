/*
 * Title: Practice 19
 * Name: Ezekiel P. Villadolid
 * Description: program that prompts the user to input a number. The program should then output the
                number and a message saying whether the number is positive, negative or zero.
 * Date: 4/14/2021
*/
package Practice19;

import java.util.Scanner;

public class Practice19 {
    
    //variable declaration
    private static int num;
    
    public static void main(String[] args) {
       
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter An Integer Value: ");
        num = console.nextInt();
        integerChecker();
        
    }
    
    //method to perform the checking
    public static void integerChecker(){
        //the condition to check if Integer is a positive number
        if(num > 0) {
            System.out.println("The given number "+num+" is Positive");
        }
         //the condition to check if Integer is a negative number
        else if(num < 0) {
            System.out.println("The given number "+num+" is Negative");
        }
         //This will perform if integer is not a negative or positive value
        else {
            System.out.println("The given number "+num+" is neither Positive nor Negative ");
        }
        
    }
    
}
