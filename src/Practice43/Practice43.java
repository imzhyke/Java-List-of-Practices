/*
 * Title : Practice 43 
 * Name : Ezekiel P. Villadolid
 * Description:Program to insert an element in an Array
 * Date: 6/3/2021
*/
package Practice43;

import java.util.Scanner;


public class Practice43 {


     public static void main(String[] args) {
       //Creating Scanner
       Scanner thisScans = new Scanner(System.in);
      
       //Declaring and initialization
      int n = 6; 
      //Add 1 index reserved for insertion of element
      int[] arr =  new int[n+1]; 
      System.out.println("Enter 6 Elements in array: " );
      //Get the elements of the array
      for(int x = 0 ; x < n ; x++){
          //Get the element of the current index 
          arr[x]=thisScans.nextInt();
       }
      //Get the location where element to be inserted
      System.out.print("Enter the  location you want to insert: ");
      int pos =  thisScans.nextInt(); 
      //Get the element to be inserted
      System.out.print("Enter the value to insert: ");
      int x = thisScans.nextInt();
      
      //To insert the elenet inside the array
      for(int i = (n-1); i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = x;
       
        //To display the elemens in array after insertion
      System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[n]+"\n");
      
    }
    
}
