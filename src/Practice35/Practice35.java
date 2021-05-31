/*
 * Title: Practice 35
 * Name:  Ezekiel P. Villadolid
 * Description:  Create a Java program that identifies the marks of the inputted grade by the user.
 * Date: 5/31/2021
*/
package Practice35;

import java.util.Scanner;

public class Practice35 {
        
   public static void main(String[] args) {
        //Creating Scanner
        Scanner thisScans = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = thisScans.nextInt();
        
        
        //Array declaration
        int arr[] = new int[n];
        
        //Get the input value for array
        for(int x = 0; x < n; x++){
            System.out.print("Enter Grade ["+(x+1)+"] : ");
                arr[x]=thisScans.nextInt();
        }
       
        //To display if element is even or odd
        for(int x = 0; x < n; x++){
            //Check if grade is A
            if(arr[x] <= 100 && arr[x]>=90){
                System.out.println(arr[x]+" is grade A");
            }
            //Check if grade is B
            else if(arr[x] <= 89&& arr[x]>=80){
                System.out.println(arr[x]+" is grade B");
            }
            //Check if grade is C
            else if(arr[x] <= 79&& arr[x]>=70){
                System.out.println(arr[x]+" is grade C");
            }
            //Check if grade is D
            else if(arr[x] <= 69&& arr[x]>=60){
                System.out.println(arr[x]+" is grade D");
            }
            //Check if grade is E
            else if(arr[x] <= 59&& arr[x]>=0){
                System.out.println(arr[x]+" is grade E");
            }
        }
    }    
    
}
