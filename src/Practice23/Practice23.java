/*
 * Title: Practice 23
 * Name: Ezekiel P. Villadolid
 * Description: program that prompts the user to enter the total number of cookies. 
 * The program then outputs the number of boxes and the number of containers to ship the cookies.
 * Date: 4/19/2021
 */

package Practice23;

import java.util.Scanner;

public class Practice23 {
    
    //Final value
    private static final int  COOKIES_PER_CONTAINER= 1800;
    private static final int  COOKIES_PER_BOX= 24;
    private static final int  BOX_PER_CONTAINER = 75;
    
    public static void main(String[] args) {
     
       //Declaration and initialization of variables
        int leftCont=0;
        int leftBox=0;
        int leftCookies=0;
        
        int shipCont=0;
        int shipBox=0;
        int shipCookies=0;
        
        Scanner read = new Scanner(System.in);
        
        //To get the total number of cooikes
        System.out.print("Enter Total number of cookies: ");
        int totalCookies = read.nextInt();
        
        
        /*Condition If number of cookies equal or more 
          than to the number of cookies per container */
        if (totalCookies >= COOKIES_PER_CONTAINER){
            
            //To get the number of containers to be ship
            shipCont = totalCookies / COOKIES_PER_CONTAINER;
            
          //Condition If number of cookies exceeds to the number of cookies per container
            if(totalCookies % COOKIES_PER_CONTAINER != 0 ){
                
                leftCont++;// A left over container will be added
        
                 //To get the total number of left over cookies    
                leftCookies = totalCookies % COOKIES_PER_CONTAINER;
                
                 //To get the number of left over boxes  
                leftBox = leftCookies/COOKIES_PER_BOX; 
                
                //Condtion  if cookies exeeds to the number of cookies per box
                if(leftCookies%COOKIES_PER_BOX != 0){
                    leftBox++; //Another left over box will be added
                }
                
            }
            
            //Formula to get the total number of boxes and cookies to ship
            shipBox = shipCont*BOX_PER_CONTAINER;
            shipCookies = shipCont*COOKIES_PER_CONTAINER;

        }
        
        /*This will execute if the total number of cookies 
          don't met the required number of cookies per container*/
        
        else{
            
            //To get the number of left over boxes
            leftBox = totalCookies/COOKIES_PER_BOX;
            
            //Condition if the cookies exeeds to the number of cookies per box
            if(totalCookies%COOKIES_PER_BOX != 0){
                leftBox++; //Another left over box will be added
            }
            
            //To get the number of left over containers  
            leftCont = leftBox/ BOX_PER_CONTAINER;
            
            //Condition if box exceeds to the number of box per container
            if(leftBox%BOX_PER_CONTAINER !=0){
                leftCont++; //Another container will be added
            }
        }    
            
            //To display the number of containers,box, and cookies shipped
            System.out.println("\nShipped Details");
            System.out.println("Containers: "+shipCont);
            System.out.println("Box: "+shipBox);
            System.out.println("Cookies: "+shipCookies);
            
            //To display the number of containers,box, and cookies left
            System.out.println("\nLeft Over Details");
             System.out.println("Containers: "+leftCont);
            System.out.println("Box: "+ leftBox);
            System.out.println("Cookies: "+leftCookies);
            

    }
}
