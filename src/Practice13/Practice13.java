/*
 * Title: Practice 13
 * Name: Ezekiel P. Villadolid
 * Description: Converting seconds into hh:mm:ss format
 * Date: March 19, 2021
*/
package Practice13;

import java.util.Scanner;

public class Practice13 {

     public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //To get the entered seconds
        System.out.print("Input seconds: ");
	int seconds = console.nextInt();  
        
        //To get seconds
        int s1 = seconds % 60;
        
        //To get the hours and minutes
        int s2 = seconds / 60;
        int s3 = s2 % 60;
        s2 = s2 / 60;
        
        System.out.print( s2 + ":" + s3 + ":" + s1);
        System.out.print("\n");
    }    
    
}
