
package Practice44;

import java.util.Scanner;


public class Practice44 {

    public static void main(String[] args) {
        
        Scanner thisScans = new Scanner(System.in);
        
        int arr[]=new int[20];
        
        int exel=0,ave=0,good=0,poor=0;
        System.out.println("Enter student marks:");
        for(int x= 0 ; x < arr.length ; x++){
            System.out.print("Student "+(x+1)+": ");
            arr[x] = thisScans.nextInt();
            if( arr[x]>=76&& arr[x]<=100){
                exel++;
            }
            else if( arr[x]>=51&& arr[x]<=75){
                good++;
            }
            else if( arr[x]>=26&& arr[x]<=50){
                ave++;
            }
            else if( arr[x]>=0&& arr[x]<=25){
                poor++;
            }
        }
        
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
