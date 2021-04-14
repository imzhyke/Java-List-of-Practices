/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice20;

import java.util.Scanner;

/**
 *
 * @author Zhyke
 */
public class Practice20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter numbers between 0-35: ");
        int num = console.nextInt();
        
        if(num<=9||num>=0){
            System.out.println(num);
        }
        else if(num>9||num<=35){
            num+=55;
            char c=(char)num;  
            System.out.print(c);
        }
    }
}
