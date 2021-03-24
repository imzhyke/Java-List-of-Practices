/*
 * Title: Practice 10
 * Name: Ezekiel P. Villadolid
 * Description: Converting 5 decimals to int 
 * Date: March 19, 2021
*/  
package Practice10;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
          
            Scanner console = new Scanner(System.in);
            
            //to get the 5 decimal numbers
            System.out.print("Input 5 decimal numbers: ");
            double num1 = console.nextDouble();
            double num2 = console.nextDouble();
            double num3 = console.nextDouble();
            double num4 = console.nextDouble();
            double num5 = console.nextDouble();
            
            //to print the decimal numbers
            System.out.println("Number 1 = "+ num1);
            System.out.println("Number 2 = "+ num2);
            System.out.println("Number 3 = "+ num3);
            System.out.println("Number 4 = "+ num4);
            System.out.println("Number 5 = "+ num5);
            
            //to convert the decimal numbers to nearest int
            int n1 = (int) Math.round(num1);
            int n2 = (int) Math.round(num2);
            int n3 = (int) Math.round(num3);
            int n4 = (int) Math.round(num4);
            int n5 = (int) Math.round(num5);

            //to sum the 5 converted int
            int sum = n1+n2+n3+n4+n5;
            
            //to get the avaerage 
            int ave = sum/5;
            
            //To print the sum and the average
            System.out.println("The Sum: "+ sum);
            System.out.println("The Average: "+ ave);
            
    }
    
}
