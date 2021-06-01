
package Practice42;

import java.util.Scanner;

public class Practice42 {

    public static void main(String[] args) {
       Scanner thisScans = new Scanner(System.in);
       
        System.out.println("Enter 6 Array Element: " );
       int[] arr = new int[6];
       
       for(int x = 0 ; x < arr.length ; x++){
           arr[x]=thisScans.nextInt();
       }
       int firstLarge=getfirstLarge(arr);
       int secondLarge=getsecLarge(arr,firstLarge);
       
       System.out.println("The Largest Number in array is: "+firstLarge);
       System.out.println("The Second Largest Number in array is: "+secondLarge);
    }
    
    public static int getfirstLarge(int[] arr){
        int firstLarge = arr[0];
        for(int i=1;i < arr.length;i++){
          if(arr[i] > firstLarge){
            firstLarge = arr[i];
          }
        }
        return firstLarge;
    }
    public static int getsecLarge(int[] arr,int firstLarge){
        int secLarge = arr[0];
        for(int i=1;i < arr.length;i++){
          if(secLarge == firstLarge){
              secLarge = arr[0+1];
          }else{
              if(arr[i] > secLarge){
              secLarge = arr[i];
          }
          }
          
        }
        return secLarge;
    }
    
}
