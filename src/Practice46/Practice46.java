/*
 * Title : Practice 46 
 * Name : Ezekiel P. Villadolid
 * Description: Sum of two matrices using Two dimensional arrays
 * Date: 6/3/2021
*/
package Practice46;

import java.util.Scanner;

public class Practice46 {

    public static void main(String[] args) {
       //Creating Scanner
        Scanner thisScans = new Scanner(System.in);
        int row=2, col=2;
        //Array Declartion
        double arr1[][] = new double[row][col];
        double arr2[][] = new double[row][col];
        double sum[][] = new double[row][col];
        
        //Get elements of 1st matrix
        System.out.println("Enter elements of 1st matrix");
        for(int x = 0 ; x < row ; x++){
            for(int y = 0 ; y < col ; y++){
                System.out.print("Enter Array["+x+"]["+y+"]:");
                arr1[x][y] = thisScans.nextDouble();
            }
        }
       //Get elements of 2nd matrix
        System.out.println("Enter elements of 2st matrix");
        for(int x = 0 ; x < row ; x++){
            for(int y = 0 ; y < col ; y++){
                System.out.print("Enter Array["+x+"]["+y+"]:");
                arr2[x][y] = thisScans.nextDouble();
            }
        }
        //Calculate the sum of 2 matrix
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j) {
              sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
         // printing the result
        System.out.println("Sum of 2 matrix");
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j) {
                System.out.printf("%.2f   ", sum[i][j]);
                if (j == col - 1) {
                  System.out.printf("\n\n");
                }
            }
        }
    }
    
}
