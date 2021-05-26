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
        
        //Scanner
        Scanner thisScans = new Scanner(System.in);
        
        //declaration of variable
        int sumOfInt = 0;
        
        //To get the needed data.
        System.out.print("Input an integer: ");
        String stringOfNum = thisScans.next(); //Treat it as string
        
        int size = stringOfNum.length(); //To check the string present
        
        for(int x=0; x<size;x++){
            if(stringOfNum.charAt(x)=='-'){
                //This will ignore the negative char
            }
            else{ //Otherwise assign enevery character in string in a char variable
                char ch = stringOfNum.charAt(x);
                int num = ch - '0';  //and conver it as integer
                
                //This will add all the converted integer
                sumOfInt+=num;
                
                //To display the currect char
                System.out.print(stringOfNum.charAt(x)+" ");
            }
            
        }
        //To display the loop
        System.out.println("Sum: "+sumOfInt);
    }
    
}
