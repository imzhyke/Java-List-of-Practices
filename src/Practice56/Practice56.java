/*
 * Title: Practice 56
 * Description:  Given a sorted binary array, efficiently find the number of 1’s in it
 * Name: Villadolid, Ezekiel
 * Date: 06/25/2021
*/
package Practice56;

import java.util.Scanner;

public class Practice56 {
        // Returns number of times x occurs in arr[0..n-1]
    public static int count(int[] A, int left, int right)
    {
        // if the last array element is 0, no 1's can
        // be present since it is sorted
        if (A[right] == 0) {
            return 0;
        }
 
        // if the first array element is 1, all its elements
        // are ones only since it is sorted
        if (A[left] == 1) {
            return (right - left + 1);
        }
 
        // divide the array into left and right subarray and recur
        int mid = (left + right) / 2;
        return count(A, left, mid) + count(A, mid + 1, right);
    }
    // Driver method to test above
    public static void main(String args[])
    {
        //Scanner 
        Scanner thisScans=new Scanner(System.in);
        //Delimeter for decimal
        thisScans.useDelimiter("\\D");   
        

        int n = 7;
        
        //Get array elements
        int[] arr= new int[n];  
        System.out.print("Binary Array: ");
        
        for(int x = 0 ; x < n ; x++){
            arr[x] = thisScans.nextInt();
        }
         System.out.println("The total number of 1's present is "+count(arr, 0, arr.length - 1));
    }
}
