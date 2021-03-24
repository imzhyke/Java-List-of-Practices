/*
 * Title: Practice 11
 * Name: Ezekiel P. Villadolid
 * Description: Input time interval ang calculate total time in seconds
 * Date: March 19, 2021
*/
package Practice11;

import java.util.*;
public class Practice11 {
    
    public static void main(String[] args) {
     
        Scanner console = new Scanner(System.in);
        
        //To get the time entered
        //Example input:  23:59:59
        
        System.out.print("Input elapsed time (hh:mm:ss) : ");
        String time = console.nextLine();
  
        
        String hrStr = time.substring(0, 2); //to get the hours
        String mnStr = time.substring(3, 5); //to get the minutes
        String scStr = time.substring(6, 8); //to get the seconds

        //to Convert the string to int
        int hours = Integer.parseInt(hrStr);
        int minutes = Integer.parseInt(mnStr);
        int seconds = Integer.parseInt(scStr);
        
        //To get the equivalent seconds from hours:minutes
        int hrInSec = hours*3600; 
        int mnInSec = minutes*60;
        
        //To get the total seconds
        int totalSec=hrInSec+mnInSec+seconds;

        System.out.println("Time in seconds: "+ totalSec);

    }    
 }
    
    
