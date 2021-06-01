/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice39;

import java.util.Scanner;


public class Practice39 {
    
    public static void main(String[] args) {
        //Creating Scanner
       Scanner thisScans = new Scanner(System.in);
       
       //Get Array Size
       System.out.print("Enter Array Size: ");
       int arrSize = thisScans.nextInt();
       
       //Creating array
       int[] sourceArr = new int[arrSize];
       int[] destArr = new int[arrSize];
               
       //Get array element
       System.out.print("Enter elements of source array: ");
       for(int x = 0 ; x < arrSize ; x++){
           sourceArr[x] = thisScans.nextInt();  
           destArr[x]=sourceArr[x];
       }
       //Printing the source array 
       System.out.println("Elements of source array are: ");
       printArray(sourceArr,arrSize);
       
       //Printing the dest array 
       System.out.println("Elements of dest array are: ");
       printArray(destArr,arrSize);
       
    }
    static void printArray(int[] arr,int size){
        
       boolean newLine =false; //Will be use in formatting
       //To print the aelements in an array
       for( int x=0, y = 0 ; y < size; y++ ){
           System.out.print(arr[y]); //To print the element in the index
           if(x==4){
                 System.out.print("\n\t");
                 x=0;
                 newLine=true;
             }
           else{
           System.out.print("\t\t");
           x++;
           }
          
           if(newLine && x==4){
               x=0;
               System.out.print("\n");
               newLine=false;
           }

        }
        System.out.println();
    }
    
}
