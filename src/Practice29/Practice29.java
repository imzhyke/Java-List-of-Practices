/*
 * Tittle: Practice 29
 * Name: Ezekiel P. Villadolid
 * Description: Print pattern
 * Date: 5/19/21
 */
package Practice29;

public class Practice29 {

    public static void main(String[] args) {
       System.out.println("A. Square Star Pattern");
       for(int x=0; x<5;x++){ //Loop for 5 rows
           for(int y=0; y<5;y++){ //Loop for 5 column in every row
               System.out.print("* "); //And display star
           }
           System.out.print("\n"); //Newline after inner loop
        }
       
       System.out.println("\nB. Right Triangle Star Pattern");
       
       //Outer loop
        for(int x=0; x<=5; x++){   
            //Inner Loop
            for(int y=0; y<x; y++) {
                //To print star
                System.out.print("* ");   
            } 
            //Newlin
            System.out.println();   
        }
        
         
       System.out.println("\nC. Square Binary Pattern");
       //Outer Loop
       for(int x=0; x<5;x++){
           //Inner Loop
           for(int y=0; y<5;y++){
               //Just to get the binary effect
               //If Y Is Odd
               if(y%2==0){
                   //Print 0 
                   System.out.print("0 ");
               }
               //If even
               else{ 
                   //Will print One
                   System.out.print("1 ");
               }
           }
           //Newline
           System.out.print("\n");
        }
       
       System.out.println("\nD. Downward Triangle Star Pattern");
        int rows=5;      
        //outer loop  
        for (int i= rows-1; i>=0 ; i--) {  
            //Inner Loop
            for (int j=0; j<=i; j++){  
            //prints star and space  
            System.out.print("*" + " ");  
            }  
        //New line after innerloop
        System.out.println();  
        }  
 
    }
}
