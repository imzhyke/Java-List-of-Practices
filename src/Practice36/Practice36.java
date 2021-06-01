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
        //method Call  to get the max and min value
        int low =getMinValue(arr);
        int high =getMaxValue(arr);
        
        //Print the maximum and minimum value in an array
        System.out.println("Maximum element is "+high);
        System.out.println("Minimum element is "+low);
    }
    
    //Method to get the maximum value of an array
    public static int getMaxValue(int[] arr){
        int maxValue = arr[0];
        for(int i=1;i < arr.length;i++){
          if(arr[i] > maxValue){
            maxValue = arr[i];
          }
        }
        return maxValue;
    }
    
    //Method to get the minimum value of an array
    public static int getMinValue(int[] arr){
          int minValue = arr[0];
          for(int i=1;i<arr.length;i++){
            if(arr[i] < minValue){
              minValue = arr[i];
            }
          }
          return minValue;
    }

}
