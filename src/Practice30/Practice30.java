/*
 * Title: Practice 30
 * Name:  Ezekiel P. Villadolid
 * Description: Create a program having a three by four two dimentional array. Multiply each elemtn bt 10 and display the result value. 
 * Date: 5/26/2021
*/
package Practice30;

import java.util.Scanner;


public class Practice30 {

    public static void main(String[] args) {
        //Create the scanner
        Scanner thisScans = new Scanner(System.in);
        
        //Decration of array
        int arr[][] = new int [3][4];
        
        //To get the value of the arrays
        for(int x=0 ; x<3 ; x++){
             for(int y=0 ; y<3 ; y++){
                 //To get the value of each elemets
                 System.out.printf("Enter value [%d][%d]: ",x,y);
                 arr[x][y] = thisScans.nextInt();
                 
                 //To multiply the value of the present element
                 arr[x][y] *= 10;
            }
        }
        
        //Tp print the value of the element
        System.out.println("\nValue of Each element after multiplying by 10");
        for(int x=0 ; x<3 ; x++){
             for(int y=0 ; y<3 ; y++){
                 System.out.printf("Element "+(x+(y+1))+" :"+ arr[x][y]);
                 System.out.println();

            }
        }

    }
    
}
