/*
 * Title : Practice 50
 * Name : Ezekiel P. Villadolid
 * Description: Bubble sort -String
 * Date: 6/3/2021
*/
package Practice50;

import java.util.Scanner;


public class Practice50 {

    //The bubble sort method
        static void bubbleSort(String[] str) {  
        int n = str.length;  
        String temp; 
        //Bubble sort process
       	for (int j = 0; j < str.length; j++) {
   	   for (int i = j + 1; i < str.length; i++) {
		// comparing adjacent strings
		if (str[i].compareTo(str[j]) < 0) {
			temp = str[j];
			str[j] = str[i];
			str[i] = temp;
		}
	   } 
        }
  
  
    }  
    public static void main(String[] args) {  
               //Creating scanner
               Scanner thisScans = new Scanner(System.in);
                 
               //Get the size of array
                System.out.println("Enter 5 Strings");
                int n = 5;
                
                //Get the elements of an array

                String str[] =new String [n];  
                for(int x = 0 ; x < n ; x++){
                   System.out.print("["+(x+1)+"]: ");
                   str[x]= thisScans.nextLine();
                }
                
                //Sorting array elements using bubble sort  
                bubbleSort(str);
                
                //Print the  elements of array after sorting
                System.out.println("\nString in sorted order are");  
                for(int i=0; i < n; i++){  
                        System.out.print("String ["+(i+1)+"]: ");
                        System.out.println(str[i] + " ");  
                }  
                
                System.out.println();
        }
}
