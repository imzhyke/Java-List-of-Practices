/*
 * Title : Practice 42
 * Name : Ezekiel P. Villadolid
 * Description:Program to print the largest and second largest element of the array.
 * Date: 6/3/2021
*/
package Practice42;


public class Practice42 {

    public static void main(String[] args) {

       int[] arr =  { 1, 5, 3, 2, 0, 5, 7, 6 };
      System.out.println("Elements in array: " );
      for(int x = 0 ; x < arr.length ; x++){
          System.out.print(arr[x]+" ");
     }
     System.out.println( );
       int max=arr[0];
       int second_max=arr[0];
       
    for( int i = 0; i < arr.length; i++ ) {
        // Is it the max?
        if( arr[i] > max ) {
            // Make the old max the new 2nd max.
            second_max = max;
            // This is the new max.
            max = arr[i];
        }
        // It's not the max, is it the 2nd max?
        else if( arr[i] > second_max ) {
            second_max = arr[i];
        }
    }
       //To display the largets and 2nd largest number in an array
       System.out.println("The Largest Number in array is: "+max);
       System.out.println("The Second Largest Number in array is: "+second_max);
    }
    
    
}
    