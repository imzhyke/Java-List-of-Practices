/*
 * Title: Practice 31
 * Name:  Ezekiel P. Villadolid
 * Description: Read and print  a rowcolumn matrix, number of rows and number of columns will be read through the user.
 * Date: 5/26/2021
*/
package Practice31;

import java.util.Scanner;

public class Practice31 {
    public static void main(String[] args) {
            //Create the scanner
            Scanner thisScans = new Scanner(System.in);
            
            System.out.print("Enter number of rows: ");
            int rows = thisScans.nextInt();
            
            System.out.print("Enter number of columns: ");
            int columns = thisScans.nextInt();

            //Decratn of arrayio
            int arr[][] = new int [rows][columns];

            //To get the value of the arrays
            for(int x=0 ; x<rows ; x++){
                 for(int y=0 ; y<columns ; y++){
                     //To get the value of each elemets
                     System.out.printf("Enter value [%d][%d]: ",x,y);
                     arr[x][y] = thisScans.nextInt();
                }
            }

            //Tp print the value of the element
            System.out.println("\nValue of array");
            for(int x=0 ; x<rows ; x++){
                 for(int y=0 ; y<columns ; y++){
                     System.out.print(arr[x][y]+"\t");
                }
                System.out.println();
             }

    }
}
