/*
 * Title: Practice 34
 * Name:  Ezekiel P. Villadolid
 * Description: Java program that will identify if it is odd or even.
 * Date: 5/26/2021
*/
package Practice34;

import java.util.Scanner;

public class Practice34 {


    public static void main(String[] args) {
        //Creating Scanner
        Scanner thisScans = new Scanner(System.in);
        
        //Array declaration
        int arr[] = new int[5];
        
        //Get the input value for array
        for(int x = 0; x < arr.length; x++){
            System.out.print("Input Number "+(x+1)+": ");
                arr[x]=thisScans.nextInt();
        }
        
        //To display if element is even or odd
        for(int x = 0; x < arr.length; x++){
            if(arr[x]%2 == 0){
                System.out.println(arr[x]+" is EVEN");
            }
            else{
                 System.out.println(arr[x]+" is ODD");
            }
        }
        
    }
    
}
