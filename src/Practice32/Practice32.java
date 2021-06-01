/*
 * Title: Practice 32
 * Name:  Ezekiel P. Villadolid
 * Description: Java program that will print the sum of the numbers that has been input by user
 * Date: 5/26/2021
*/
package Practice32;

import java.util.Scanner;


public class Practice32 {

    public static void main(String[] args) {
        //Create the scanner
          Scanner thisScans = new Scanner(System.in);
          double arr[] = new double[3];
          double sum=0;
          
          //To get the  value of an array
          for (int x=0;x<3;x++){
              System.out.printf("Enter Number %d: ",x+1);
              
              //Get the value of the index
              arr[x]=thisScans.nextDouble();
              
              //To get the sum 
              sum= arr[x]+ sum;
          }
          
          System.out.println("Sum: "+sum);

    }
    
}
