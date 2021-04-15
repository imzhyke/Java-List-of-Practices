/*
 * Title: Practice 21
 * Name: Ezekiel P. Villadolid
 * Description: program that accepts a student’s numerical grade, converts the numerical grade to an equivalent letter grade displays the letter grade
 * Date: 4/14/2021
 */
package Practice21;

import java.util.Scanner;

public class Practice21 {

   
    public static void main(String[] args) {
        //creating scanner 
       Scanner console = new Scanner(System.in);
       
       //to get the numerical grade
       System.out.print("Enter Numeric Grade: " );
       int grade = console.nextInt();
       
       
       if(grade>100){ //conditio if the grade entered is invalid
           System.out.println("Not valid marks");
       }
       else{ //the codes in this will else statement will execute if the grade entred is valid
           if(grade>=90){  //Greater than or equal to 90 Your grade is A
               System.out.println("Your grade is A");
           }
           else if(grade<90&&grade>=80){ //Less than 90 but greater than or equal to 80 Your grade is B
               System.out.println("Your grade is B");
           }
           else if(grade<80&&grade>=70){ //Less than 80 but greater than or equal to 70 Your grade is C
               System.out.println("Your grade is C");
           }
           else if(grade<70&&grade>=60){//Less than 70 but greater than or equal to 60 Your grade is D
               System.out.println("Your grade is D");
           }
           else{ //Less than 60 Your grade is F
               if(grade>=0){ //Condition that grade will not be lesser than 0
               System.out.println("Your grade is F");
               }
           }
       }

    }
    
}
