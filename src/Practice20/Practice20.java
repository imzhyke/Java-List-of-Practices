/*
 * Title: Practice 20
 * Name: Ezekiel P. Villadolid
 * Description: program that prompts the user to input an integer between 0 and 35. If the number is
                less than or equal to 9, the program should output the number; otherwise, it should output A
                for 10, B for 11, C for 12,....., and Z for 35.
 * Date: 4/14/2021
*/
package Practice20;

import java.util.Scanner;


public class Practice20 {

   public static void main(String[] args) {
       //CREATING SCANNER
        Scanner console = new Scanner(System.in);
        
        //ASK USER TO INPUT AN INTEGER VALUE 
        System.out.print("Enter numbers between 0-35: ");
        int num = console.nextInt();
        
        //condition if a value is less than or equals to 9 and not lower than zero
        if(num<=9&&num>=0){
            System.out.println(num); //This will print the integer entered 
        }
        //condition if a value is greater than to the value of 9 and not higher than 35
        else if(num>9&&num<=35){
            num=num+55; //Since character 'A' has the value of 65
            char c=(char)num;  //To typecasting the value of num
            System.out.println(c+" for "+(num-55));
        }
        
     }
    
}
