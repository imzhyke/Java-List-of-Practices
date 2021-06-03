/*
 * Title : Practice 47 
 * Name : Ezekiel P. Villadolid
 * Description: Passing two-dimensional array to a function
 * Date: 6/3/2021
*/
package Practice47;

import java.util.Scanner;

public class Practice47 {
    
    public static void main(String[] args) {
        //Creating Scanner
        Scanner thisScans = new Scanner(System.in);
        //Declaring a 2D Array
        int[][] arr = new int[2][2];
        //Get the elements of the array
        System.out.println("Enter 4 Number");
        for(int x=0 ; x < 2 ; x++){
            for(int y = 0 ; y <2 ; y++){
                //Get the element of current index
                arr[x][y]=thisScans.nextInt();
            }
        }
        //Passing the value of 2d array 
        diplayArr(arr);
    }
    //Method to display the value of passed 2d Array
    public static void diplayArr(int[][] arr){
        System.out.println("Displayig:");
        for(int x=0 ; x < 2 ; x++){
            for(int y = 0 ; y <2 ; y++){
                System.out.println(arr[x][y]);
            }
        }
    }
}
