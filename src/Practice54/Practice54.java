/*
 * Title: Practice 54
 * Description:  Given a List of Distinct N number a1,a2,a3........an.
                Find The Position Of Number K In The Given List.
 * Name: Villadolid, Ezekiel
 * Date: 06/25/2021
*/
package Practice54;

import java.util.Scanner;

public class Practice54 {
     
    //Perform Linear Search
    static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    //Main Method
    public static void main(String a[]){ 
        
        //Scanner 
        Scanner thisScans=new Scanner(System.in);
        //Delimeter for decimal
        thisScans.useDelimiter("\\D");
        
        //Get N Value
        System.out.print("Enter n: ");
        int n = thisScans.nextInt();
        
        //Get array elements
        int[] arr= new int[n];  
        System.out.print("Enter "+(n)+" Elements: ");
        for(int x = 0 ; x < n ; x++){
            arr[x] = thisScans.nextInt();
        }
        
        //Key to find
        System.out.print("Enter key: ");
        
        //Perform the linearsearch method
        int key = thisScans.nextInt();
          
        //Print the index of key.
        System.out.println(key+" is found at index: "+linearSearch(arr, key));    
    }    
 
}
