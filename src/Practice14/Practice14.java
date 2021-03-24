/*
 * Title: Practice 14
 * Name: Ezekiel P. Villadolid
 * Description: Kilogram to pounds
 * Date: March 22, 2021
*/
package Practice14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice14 {
    
    //Declaring Decimal Format
    private static final DecimalFormat dec2Pla= new DecimalFormat("#.##");
    
    //Main method 
    public static void main(String[] args) {
        //declaration of variables needed
        double kg,pounds;
        
        //declaration of scanner
        Scanner console= new Scanner(System.in);
        
        System.out.print("Enter Weight In KG: ");
        kg = console.nextDouble();
        
        //Formula to convert KG to Pounds
        pounds = kg*2.2;
        
       
        System.out.println("Weight in Pounds:" + dec2Pla.format(pounds));

        
    }
    
}
