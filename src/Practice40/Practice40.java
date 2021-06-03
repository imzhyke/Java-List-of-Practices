/*
 * Title : Practice 40 
 * Name : Ezekiel P. Villadolid
 * Description:Reversing a One-Dimensional Array: Write a Java Program that reads an integer one
                dimensional array of size N. The program then reverses the elements of the array and
                stores them in reverse order in the same array.
 * Date: 6/3/2021
*/
package Practice40;

import java.util.Scanner;

public class Practice40 {

    public static void main(String[] args) {
       //Creating Scanner
        Scanner thisScans = new Scanner(System.in);
        
       System.out.print("Enter Array Size: ");
       int n = thisScans.nextInt();
       int[] arr = new int[n];
       
       System.out.print("Enter ["+(n)+"] Element In Array: ");
       for(int x = 0 ; x < n ; x++){
           arr[x] = thisScans.nextInt();
       }
       
       System.out.println("ORIGINAL ELEMENTS OF THE ARRAY");
       for(int x = 0 ; x < n ; x++){
           System.out.print(arr[x]+" "); 
       }    
       
       //Declaring temp var and initializing var the value of in to y var
       int temp, y = n;
       //The loop will run half of the array size
       for(int x = 0; x < (n/2) ; x++ , y--){
               temp = arr[x];
               arr[x] = arr[y-1];
               arr[y-1] = temp;

       }

       //Print the reversed array
       System.out.println("\nREVERED ELEMENTS OF THE ARRAY");
       for(int x = 0 ; x < n ; x++){
           System.out.print(arr[x]+" ");
       }
        System.out.println();
    }
    
}
