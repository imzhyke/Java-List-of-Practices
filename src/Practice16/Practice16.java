    /*
 * Title: Practice 16
 * Name: Ezekiel P. Villadolid
 * Description: Converting the temperature from Fahrenheit to Celcius
 * Date: March 22, 2021
*/
package Practice16;

//Adding imports needed
import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice16 {

    public static void main(String[] args) {
        //the scanner
        Scanner console = new Scanner(System.in);
        
        //for decimal formatting
        DecimalFormat df2 = new DecimalFormat("#.##");
        
        //Declaration of variables needed
        double cel,fah;
        
        System.out.print("Input temperature (°F): ");
        fah = console.nextDouble();
        
        //Formula to convert Fahrenheit to Celcius
        cel= (fah - 32)*5/9;
      
        System.out.println("Temperature: "+df2.format(cel)+" °C");
    }

}
