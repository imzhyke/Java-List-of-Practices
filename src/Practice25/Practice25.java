/*
 * Title: Practice 25
 * Name: Ezekiel P. Villadolid
 * Description: Write a program that reads a set of integers, and then finds and prints the sum fo the even and odd integers.
 * Date: 4/19/2021
 */
package Practice25;

import java.util.Scanner;

public class Practice25 {

    public static void main(String[] args) {

      //Declaration and initialization
         int numToEnter;
         int numEntered;
         int oddSum = 0;
         int evenSum = 0;

         Scanner readInput = new Scanner(System.in);

         //To get the number of values will be entred
         System.out.print("Enter the number of values: ");
         numToEnter = readInput.nextInt();

         for (int i = 0; i < numToEnter; i++){
                 //to get the value
                 System.out.printf("Enter your value(%d): ",i+1);
                 numEntered = readInput.nextInt();

                 //To check if entered value is even num
                 if (numEntered % 2 == 0){
                     evenSum += numEntered; //Sum the even numbers
                 }

                 //Else The value enter is an odd number
                 else{
                     oddSum += numEntered; //Sum the odd numbers
                 }
         }

         //To print the sum of even numbers
         System.out.print("Sum of Even Numbers: ");
         System.out.print(evenSum);
         System.out.print("\n");

         //To print the sum of Odd numbers
         System.out.print("Sum of Odd Numbers: ");
         System.out.print(oddSum);
         System.out.print("\n");
    }

}
