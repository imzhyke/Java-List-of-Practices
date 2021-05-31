/*
 * Title: Practice 33
 * Name:  Ezekiel P. Villadolid
 * Description: Program to find the average of n (n < 5) numbers using arrays.
 * Date: 5/26/2021
*/
package Practice33;

import java.util.Scanner;

public class Practice33 {
    
    public static void main(String[] args) {
            //Create the scanner
              Scanner thisScans = new Scanner(System.in);
              
              double ave=0;
              //Get the n value
               System.out.printf("Enter n: ");
              int n = thisScans.nextInt();
              
              double arr[] = new double[n];
              for (int x=0;x<n;x++){
                  System.out.printf("Enter Number %d: ",x+1);
                  arr[x]=thisScans.nextDouble();
                  //Get the total score
                  ave= arr[x]+ ave;
              }
              //divide bt n to get the average
              ave/=n;
              
              //print the average
              System.out.println("Average: "+ave);
    }
    
}