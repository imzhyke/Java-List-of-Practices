/*
 * Title : Practice 51
 * Name : Ezekiel P. Villadolid
 * Description: Selection sort - strings
 * Date: 6/3/2021
*/

package Practice51;

import java.util.Scanner;


public class Practice51{

	
// Sorts an array of strings
static void selectionSort(String arr[],int n)
{
	// One by one move boundary of unsorted subarray
	for(int i = 0; i < n - 1; i++)
	{
	
		// Find the minimum element in unsorted array
		int min_index = i;
		String minStr = arr[i];
		for(int j = i + 1; j < n; j++)
		{
			
			/*compareTo() will return a -ve value,
			if string1 (arr[j]) is smaller than string2 (minStr)*/
			// If arr[j] is smaller than minStr
		
			if(arr[j].compareTo(minStr) < 0)
			{
				// Make arr[j] as minStr and update min_idx
				minStr = arr[j];
				min_index = j;
			}
		}

	// Swapping the minimum element
	// found with the first element.
	if(min_index != i)
	{
		String temp = arr[min_index];
		arr[min_index] = arr[i];
		arr[i] = temp;
	}
	}
}

// Driver code
public static void main(String args[])
{
    
        Scanner thisScans = new Scanner(System.in);
        
	String arr[] = new String[3];
        
       
	int n = arr.length;
		System.out.println("Given array is");
		
        for(int i = 0; i < n; i++)
	{
		System.out.print(i+": ");
                arr[i] = thisScans.nextLine();
	}        
             

	selectionSort(arr, n);

	System.out.println("Sorted array is");
	
	// Printing the array after sorting
	for(int i = 0; i < n; i++)
	{
		System.out.println(i+": "+arr[i]);
	}
}
}



