/*
 * Title: Practice 19
 * Name: Ezekiel P. Villadolid
 * Description: 
 * Date: 
*/
package Practice19;

import java.util.Scanner;

public class Practice19 {
    
    private static int num;
    
    public static void main(String[] args) {
       
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter An Integer Value: ");
        num = console.nextInt();
        integerChecker();
        
    }
    
    public static void integerChecker(){
        if(num > 0)
        {
            System.out.println("The given number "+num+" is Positive");
        }
        else if(num < 0)
        {
            System.out.println("The given number "+num+" is Negative");
        }
        else
        {
            System.out.println("The given number "+num+" is neither Positive nor Negative ");
        }
        
    }
    
}
