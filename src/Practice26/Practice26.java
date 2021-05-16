/*
 * Title: Practice 26
 * Name: Ezekiel P. Villadolid
 * Description: Program that prompts the user to input an integer and then outputs both the individual digits of the number and the sum of the digits. 
 * Date: 4/19/2021
 */

package Practice26;

import java.util.Scanner;

public class Practice26 {

    public static void main(String[] args) {
        
        Scanner thisScans = new Scanner(System.in);
        
        int sumOfInt = 0;
        
        System.out.print("Input an integer: ");
        String stringOfNum = thisScans.next();
        int size = stringOfNum.length();
        
        for(int x=0; x<size;x++){
            if(stringOfNum.charAt(x)=='-'){
                
            }
            else{
                char ch = stringOfNum.charAt(x);
                int num = ch - '0';
                sumOfInt+=num;
            
                System.out.print(stringOfNum.charAt(x)+" ");
            }
            
        }
        System.out.println("Sum: "+sumOfInt);
      
    }
    
}
