/*
 * Title: Practice 55
 * Description:  Given a sorted array of integers containing duplicates, count occurrences of a number provided.
                 If the element is not found in the array, report that as well.
 * Name: Villadolid, Ezekiel
 * Date: 06/25/2021
*/
package Practice55;

import java.util.Scanner;

public class Practice55 {
    
    // Returns number of times x occurs in arr[0..n-1]
    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        //Scanner 
        Scanner thisScans=new Scanner(System.in);
        //Delimeter for decimal
        thisScans.useDelimiter("\\D");   
        
        //Get N Value
        System.out.print("Enter array size: ");
        int n = thisScans.nextInt();
        
        //Get array elements
        int[] arr= new int[n];  
        System.out.print("Enter "+(n)+" Elements: ");
        
        for(int x = 0 ; x < n ; x++){
            arr[x] = thisScans.nextInt();
        }
        System.out.print("Target: ");
        int target = thisScans.nextInt();
        
        System.out.println("Element "+target+" occurs "+countOccurrences(arr, n, target)+" times");
    }
}
