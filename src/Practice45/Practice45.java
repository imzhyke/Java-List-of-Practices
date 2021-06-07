/*
 * Title : Practice 45 
 * Name : Ezekiel P. Villadolid
 * Description: Two Dimensional Array to store and print values.
                Java program to store temperature of two cities for a week and display it.
 * Date: 6/3/2021
*/
package Practice45;

import java.util.Scanner;

public class Practice45 {

    public static void main(String[] args) {
       //Creating Scanner
        Scanner thiScans = new Scanner(System.in);
        //Variable declaration and initialization
        int cityNo = 2;
        int day = 7;
        //Creating 2D Array
        int cityTemp[][] = new int[cityNo][day];
        System.out.println("Enter Temperature");
        //Get the Elements of 2D Array
        for(int x = 0; x < cityNo ; x++){
            for(int y = 0 ; y < day; y++){
                System.out.print("City "+(x+1)+", Day "+(y+1)+": ");
                //Get the element of the current index of array
                 cityTemp[x][y]  = thiScans.nextInt();
            }
        }
        
        //To display the value of  2D Array
        System.out.println("\nDisplaying values:");
        for(int x = 0; x < cityNo ; x++){
            for(int y = 0 ; y < day; y++){
                System.out.print("City "+(x+1)+", Day "+(y+1)+": ");
                 System.out.print(cityTemp[x][y]+"\n");
            }
        }
    }  
}
