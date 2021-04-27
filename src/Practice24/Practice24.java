/*
 * Title: Practice 24
 * Name: Ezekiel P. Villadolid
 * Description: program that mimics the calculator 
 * Date: 4/19/2021
 */
package Practice24;

import java.util.Scanner;

public class Practice24 {
   public static void main(String[] args){
        
   // Declare Variables
   int number1;
   char sign;
   int number2;
 
   //Scanner Created
   Scanner ConsoleInput = new Scanner(System.in);
   
   //To get the Two integers and the operator
   System.out.println("This program simulates a calculator.");
   System.out.print("First integer: ");
   number1=  ConsoleInput.nextInt();
   System.out.print("Second integer: ");   
   number2=  ConsoleInput.nextInt();
   System.out.print("Arithmetic operation(+, -, *, or /): ");
   sign = ConsoleInput.next().charAt(0);

   
   //A selection to identy the operation entered
   switch (sign) {
    
    //To perform addidtion if the value of sign variable is '+'
   case '+':
	  System.out.print(number1);
	  System.out.print(" + ");
	  System.out.print(number2);
	  System.out.print(" = ");
	  System.out.print(number1 + number2);
	  System.out.print("\n\n");
	  break;
    //To perform subtraction if the value of sign variable is '-'
   case '-':
	  System.out.print(number1);
	  System.out.print(" - ");
	  System.out.print(number2);
	  System.out.print(" = ");
	  System.out.print(number1 - number2);
	  System.out.print("\n\n");
	  break;
     //To perform multiplication if the value of sign variable is '*'
   case '*':
	  System.out.print(number1);
	  System.out.print(" * ");
	  System.out.print(number2);
	  System.out.print(" = ");
	  System.out.print(number1 * number2);
	  System.out.print("\n\n");
	  break;
          
    //To perform addidtion if the value of sign variablr is '/'     
   case '/':
        
	  if (number2 != 0)
	  {
		 System.out.print(number1);
		 System.out.print(" / ");
		 System.out.print(number2);
		 System.out.print(" = ");
		 System.out.print(number1 / number2);
		 System.out.print("\n\n");
	  }
          
          //This will execute if the denominator (number2) is zero
	  else
	  {
		 System.out.print("Cannot divide with zero in the denominator.\n\n");
	  }
	  break;
          
    //The default output
   default:
   System.out.print("You did not enter a valid arithmetic operation choice.\n\n");
   }
}

}
