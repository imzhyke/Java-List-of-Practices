/*
 * Title: Practice 53
 * Description:  Performed in descending order and print the lowest
element. - Insertion Sort
 * Name: Villadolid, Ezekiel
 * Date: 06/25/2021
*/
package Practice53;

import java.util.Scanner;

public class Practice53 {
    //Insertion Sort 
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0 ;i< n-1; i++){
        int min = i;
        for (int j = i+1; j< n; j++){
            if (arr[j] > arr[min]){
                min = j;
            }
        }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
 
    // Prints the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
        int low = arr[8];
        System.out.println("Lowest Element Is "+low);
    }
 
    // Driver code to test above
    public static void main(String args[])
    {
      
        Scanner thisScans = new Scanner(System.in);
        thisScans.useDelimiter("\\D");
        int arr[] = new int[9];
        
        System.out.print("Input: ");
        for(int x = 0 ; x < 9 ; x++){
            arr[x]=thisScans.nextInt();
        }
        sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
        
        
    }
}
