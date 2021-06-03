
package Practice43;

import java.util.Scanner;


public class Practice43 {


     public static void main(String[] args) {
       Scanner thisScans = new Scanner(System.in);
       
      int n = 6; 
      int[] arr =  new int[n+1];
      System.out.println("Enter 6 Elements in array: " );
      for(int x = 0 ; x < n ; x++){
          arr[x]=thisScans.nextInt();
       }
      System.out.print("Enter the  location you want to insert: ");
      int pos =  thisScans.nextInt(); 
      System.out.print("Enter the value to insert: ");
      int x = thisScans.nextInt();
      
      for(int i = (n-1); i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = x;
       
      System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[n]+"\n");
      
        
    }
    
}
