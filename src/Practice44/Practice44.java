/*
 * Title : Practice 44 
 * Name : Ezekiel P. Villadolid
 * Description:Suppose there are 20 students in a class. Each student obtains marks in range 0-100.
                Write a program to count number of students in following groups.
                Poor (0-25), Average (26-50), Good (51-75), Excellent (76-100).
 * Date: 6/3/2021
*/
package Practice44;

import java.util.Scanner;


public class Practice44 {

    public static void main(String[] args) {
       //Creating Scanner
        Scanner thisScans = new Scanner(System.in);
        
        //Declaring 1D Array 
        int arr[]=new int[20];
        
        int exel=0,ave=0,good=0,poor=0;
        
        System.out.println("Enter student marks:");
        for(int x= 0 ; x < arr.length ; x++){
            System.out.print("Student "+(x+1)+": ");
            //Get the current element entered by user to the current index
            arr[x] = thisScans.nextInt();
            //Condition to check if 
            //Students Grade is Exellent
            if( arr[x]>=76&& arr[x]<=100){
                exel++;
            }
            //Students Grade is Good
            else if( arr[x]>=51&& arr[x]<=75){
                good++;
            }
            //Students Grade is Average
            else if( arr[x]>=26&& arr[x]<=50){
                ave++;
            }
            //Students Grade is Poor
            else if( arr[x]>=0&& arr[x]<=25){
                poor++;
            }
        }
        
        //To display the hardcodded table format and the values
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("|\tGROUP\t\t|\tRANGE\t\t|\tSTUDENT COUNT\t|");
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("|\tExcellent\t|\t76-100\t\t|\t  "+exel+"\t\t|");
        System.out.println("|\tGood\t\t|\t51-75\t\t|\t  "+good+"\t\t|");
        System.out.println("|\tAverage\t\t|\t50-26\t\t|\t  "+ave+"\t\t|");
        System.out.println("|\tPoor\t\t|\t0-25\t\t|\t  "+poor+"\t\t|");
        System.out.println("+-----------------------------------------------------------------------+");
        
        
    }
    
}
