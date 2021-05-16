/*
 * Title: Practice 28
 * Name: Ezekiel P. Villadolid
 * Description: Write a program that uses while loops to perform the following steps:
                a. Prompt the user to input two integers: firstNum and secondNum. (firstNum must be less secondNum.)
                b. Output all the odd numbers between firtNum and secondNum inclusive.
                c. Output the sum of all even numbers between firstNum and secondNum inclusive.
                d. Output all the numbers and their squares between 1 and 10.
                e. Output the sum of the squares of all the odd numbers between firstNum and secondNum inclusive.
                f. Output all the uppercase letters.
 * Date: 05/15/2021
 */
package Practice28;

import java.util.Scanner;

    
public class Practice28 {


    public static void main(String[] args) {
         Scanner thisScans = new Scanner(System.in);
       
         int firstNum,secondNum ;
         
         //a. Prompt the user to input two integers
        do{
            System.out.println("\nInput two integers. First must be less than second.");
            System.out.print("Fist Number: ");
            firstNum=thisScans.nextInt();
            System.out.print("Second Number: ");
            secondNum=thisScans.nextInt();
        }while(firstNum>secondNum);
         
        
        
        //b. Output all the odd numbers between firtNum and secondNum inclusive.
        int number = (int)firstNum;

	while (number <= secondNum)
	{
		if ((number % 2) != 0)
		{
			System.out.print(number++);
			System.out.print("\n");
		}
		else
		{
			number++;
		}
	}
        
        //c. Output the sum of all even numbers between firstNum and secondNum.
	System.out.print("c. Output the sum of all even numbers between firstNum and secondNum.\n");
	number = (int)firstNum;
	int sum = 0;


	while (number <= secondNum)
	{
		if ((number % 2) == 0)
		{
			sum += number++;
		}
		else
		{
			number++;
		}
	}System.out.print("sum = ");
	System.out.print(sum);
	System.out.print("\n\n");


	//d. Output the numbers and their squares between 1 and 10.
	System.out.print("d.Output the numbers and their squares between 1 and 10.\n");
	number = 1;
	while (number <= 10)
	{
		System.out.print(number);
		System.out.print(" -> ");
		System.out.print(number);
		System.out.print("^2");
		System.out.print(" = ");
		System.out.print(number * number);
		System.out.print('\n');
		number++;
	}
	System.out.print("\n");


	//e. Output the sum of the square of the odd numbers between firstNum and secondNum.
	System.out.print("Output the sum of the square of the odd numbers between firstNum and secondNum\n");
	number = (int)firstNum;
	sum = 0;
	while (number <= secondNum)
	{
		if ((number % 2) != 0)
		{
			sum += (number * number);
			number++;
		}
		else
		{
			number++;

		}
	}
	System.out.print("sum: ");
	System.out.print(sum);
	System.out.print("\n\n");


	//f. Output all uppercase letters.
	System.out.print("Output all uppercase letters.\n");
	int c = 65;


	while (c < 91)
	{
		System.out.print((char)(c++));
		System.out.print(", ");
	}
	System.out.print("\n");

         
    }
    
}
