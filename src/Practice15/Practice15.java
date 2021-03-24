/*
 * Title: Practice 15
 * Name: Ezekiel P. Villadolid
 * Description: Program that reads the original price of the item sold, the percentage of the marked-up price and the sales tax rate.
 * Date: March 22, 2021
*/
package Practice15;

//Import needed
import java.util.Scanner;


public class Practice15 {
    
    public static void main(String[] args) {
        //Creating the scanner
        Scanner console = new Scanner(System.in);
        
        //Declaration of variables
        double orgPrice, markUpPrice,salesTaxRate;
        double storeSellPrice,salesTaxAmount,finalPrice;
        
        //To get the original price
        System.out.print("Enter the original price:\t\t");
        orgPrice=console.nextDouble();
        
        //To get the markup percentage
        System.out.print("Enter the % of mark-up (e.g. 20.0):\t");
        markUpPrice=console.nextDouble();
        
        //To get the tax rate
        System.out.print("Enter the sales tax rate (e.g. 6.75):\t");
        salesTaxRate=console.nextDouble();
        
        //Formulas to get the selling price, tax amount and final price
        storeSellPrice = (orgPrice*(markUpPrice/100))+orgPrice;
        salesTaxAmount = (storeSellPrice*(salesTaxRate/100));
        finalPrice = storeSellPrice + salesTaxAmount;
                
        //To display
        System.out.println("\nPRICE BREAKDOWN IS AS FOLLOWS");
        System.out.println("Original Price:\t\t$"+orgPrice);
        System.out.println("Markup percentage:\t"+markUpPrice+"%");
        System.out.println("Store selling price:\t$"+storeSellPrice);
        System.out.println("Sales tax rate:\t\t"+salesTaxRate+"%");
        System.out.println("Sales tax amount:\t$"+salesTaxAmount);
        System.out.println("FIANL PRICE:\t\t$"+finalPrice);
       
    }
}
    

