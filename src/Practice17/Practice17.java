/*
 * Title: Practice 17
 * Name: Ezekiel P. Villadolid
 * Description: Program that breaks down an ISBN entered by the user.
 * Date: March 22, 2021
*/
package Practice17;

import java.util.Scanner;


public class Practice17 {

  
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int gsi, group, publisher, item, check;
        //Example :
        //Enter ISBN: 978-0-393-97950-3
        
        //To get the entered data by user
        System.out.print("Enter ISBN: ");
        String ISBN = console.nextLine();
        
        //To assign the five groups of ISBN by 
        //Asssigning the converted specific substring
        gsi = Integer.parseInt(ISBN.substring(0, 3));
        group = Integer.parseInt(ISBN.substring(4, 5));
        publisher = Integer.parseInt(ISBN.substring(6, 9));
        item = Integer.parseInt(ISBN.substring(10, 15));
        check = Integer.parseInt(ISBN.substring(16, 17));
        
        //To display
        System.out.println("GSI prefix: "+ gsi);
	System.out.println("Group Identifier: "+ group);
	System.out.println("Publisher code: "+ publisher);
	System.out.println("Item number: "+ item);
        System.out.println("Check digit:"+check);
        
        
    }
    
}
