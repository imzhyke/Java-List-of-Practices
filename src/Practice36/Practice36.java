/*
 * Title: Practice 36
 * Name:  Ezekiel P. Villadolid
 * Description: Find the maximum and minimum element in an array
                Find maximum and minimum element in an array 
 * Date: 5/31/2021
*/
package Practice36;

import java.util.Scanner;

public class Practice36 {

    public static void main(String[] args) {
        
       Scanner thisScans = new Scanner(System.in);
       
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = thisScans.nextInt();
        
        //Array declaration
        int arr[] = new int[n];
        
        System.out.println("Input "+n+" Elements in the Array");
        for(int x = 0; x < n; x++){
            System.out.print("Element ["+(x+1)+"] : ");
                arr[x]=thisScans.nextInt();
        }
        int low,high,temp;
        for(int x = 0; x<n; x++){
            low=arr[x];
            high=arr[x];
            if(low>arr[x+1]){
                low = arr[x+1];
            }
            if(high<arr[x+1]){
                low = arr[x+1];
            }
        }
        
s
    }
    
}
