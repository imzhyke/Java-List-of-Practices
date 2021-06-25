/*
 * Title : Practice 52
 * Name : Ezekiel P. Villadolid
 * Description: Selection sort - ascending order and print the largest element
 * Date: 6/3/2021
*/
    
package Practice52;

import java.util.Scanner;


public class Practice52 {
    
    static void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
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
        int max = arr[8];
        System.out.println("Largest Element Is "+max);
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
