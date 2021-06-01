/*
 * Title: Practice 38
 * Name:  Ezekiel P. Villadolid
 * Description: Program to count even and odd elements in array  
 * Date: 5/31/2021
*/
package Practice38;

import java.util.Scanner;

public class Practice38 {

    public static void main(String[] args) {
        //Creating Scanner
       Scanner thisScans = new Scanner(System.in);
       
       //Get Array Size
       System.out.print("Enter Array Size: ");
       int arrSize = thisScans.nextInt();
       
       //Creating array
       int[] arr = new int[arrSize];
       
       int numOfEven=0, numOfOdd=0;
               
       //Get array element
       System.out.print("Enter "+arrSize+" elements in array: ");
       for(int x = 0 ; x < arrSize ; x++){
           arr[x] = thisScans.nextInt();
           //Check if current index is even number
           if (arr[x]%2==0) {
               numOfEven++;
           }
           //else it is an odd number
           else{
               numOfOdd++;
           }
       }
       //Print the number of even and odd in the array
        System.out.println("Total even elements: "+numOfEven);
        System.out.println("Total odd elements: "+numOfOdd);

    }
    
}
