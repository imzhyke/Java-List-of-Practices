/*
 * Title: Practice 37
 * Name:  Ezekiel P. Villadolid
 * Description: Program to print all negative elements in array. Program must do the following;
                Program must accept the size of the array coming from the user.  
                Enter number either positive or negative as to limit to the size being entered;  and  
                Generate an output that all negative elements in array being entered will display.  
 * Date: 5/31/2021
*/
package Practice37;

import java.util.Scanner;

public class Practice37 {

    public static void main(String[] args) {
        //Creating Scanner
       Scanner thisScans = new Scanner(System.in);
       
       //Get Array Size
       System.out.print("Enter Array Size: ");
       int arrSize = thisScans.nextInt();
       
       //Creating array
       int[] arr = new int[arrSize];
       
       //Get array element
       for(int x = 0 ; x < arrSize ; x++){
           System.out.print("["+(x+1)+"] Enter Nmber: ");
           arr[x] = thisScans.nextInt();
       }
       
       //Print negative value in array
       System.out.print("Negative Elements In Array: ");       
       for(int x = 0 ; x < arrSize ; x++){
           if(arr[x]<0){
               System.out.print(arr[x]+", ");
           } 
       }       
       
    }
    
}
