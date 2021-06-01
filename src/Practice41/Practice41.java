
package Practice41;

import java.util.Scanner;


public class Practice41 {

    public static void main(String[] args) {
       Scanner thisScans = new Scanner(System.in);
        
       System.out.print("Enter Number Of Students: ");
       int n = thisScans.nextInt();
       String[] studId = new String[n];
       int[] grades=new int[n];
       int average = 0;
       for(int x = 0 ; x < n ; x++){
            System.out.print((x+1)+") Enter Students ID:");
            studId[x]=thisScans.next();
            thisScans.nextLine();
            System.out.print((x+1)+") Enter Students Grade:");
            grades[x] =  thisScans.nextInt();
            average += grades[x];
       }
        
        average/=n;
        System.out.println("Average Of The Student: "+average);
        
        System.out.println("Students Got Grade Below The Average");
        System.out.println("Grade\t\tID");
        for(int x = 0 ; x < n ; x++){
            if(grades[x]<average){
                System.out.println(grades[x]+"\t\t"+studId[x]);
            }
        }
        
    }
    
    
}
