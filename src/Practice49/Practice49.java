/*
 * Title : Practice 49
 * Name : Ezekiel P. Villadolid
 * Description: Bubble sort - descending order
 * Date: 6/3/2021
*/
package Practice49;

import java.util.Scanner;

public class Practice49 {
    
    
        //The bubble sort method
        static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        //Bubble sort process
System.out.println("Bubble Sort Process");  
        for (int i = 0; i < ( n - 1 ); i++) {
              for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) 
                {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
              }
            
                //Print the elemets ever pass
                for(int x=0; x < arr.length; x++){  
                        System.out.print(arr[x] + " ");  
                }  
                System.out.println();  
         }  
  
    }  
    public static void main(String[] args) {  
               //Creating scanner
               Scanner thisScans = new Scanner(System.in);
                 
               //Get the size of array
                System.out.print("Enter array Size: ");
                int n = thisScans.nextInt();
                
                //Get the elements of an array
                System.out.print("Enter elements of array: ");
                int arr[] =new int [n];  
                for(int x = 0 ; x < n ; x++){
                   arr[x]= thisScans.nextInt();
                }
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                
                //Sorting array elements using bubble sort  
                bubbleSort(arr);
                
                //Print the  elements of array after sorting
                System.out.println("Array After Bubble Sort - Descending");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
                System.out.println();
        }
}
