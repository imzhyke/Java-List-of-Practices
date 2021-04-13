/*
 * Title: Practice 18
 * Name: Ezekiel P. Villadolid
 * Description:
 * Date: 
 */
package Practice18;

import java.util.Scanner;

public class Practice18 {

    public static void main(String[] args)
	{
	 int acc_no;
	 float acc_balance;
	 float min;
	 float intrest;
	 char acc_type;
         
         Scanner console = new Scanner (System.in);
         
	 System.out.print("Enter your Account Number:");
	 acc_no = console.nextInt();
	 System.out.print("Enter the type of account(S-Saving,C-Checking):");
	 acc_type = console.next().charAt(0);
	 System.out.print("Enter the balance of Account:");
	 acc_balance = console.nextFloat();
	 System.out.print("Enter minimum balance allowed:");
	 min = console.nextFloat();
	 System.out.print("\n");
	 System.out.print("\n");
         
	 if (acc_balance < min && (acc_type == 'S' || acc_type == 's'))
	 {
		acc_balance = acc_balance-10;
		System.out.print("10 has been deducted from account for LOW BALANCE");
		System.out.print("\n");
	 }
	 else if (acc_balance < min && (acc_type == 'C' || acc_type == 'c'))
	 {
		acc_balance = acc_balance-25;
		System.out.print("25 has been deducted from account for LOW BALANCE");
		System.out.print("\n");
	 }
	 else if (acc_balance >= min && (acc_type == 's' || acc_type == 'S'))
	 {
		intrest = (float) (acc_balance * 0.04);
		acc_balance = acc_balance + intrest;
		System.out.print("Intrest rate of 4% added to total balance");
		System.out.print("\n");
	 }
	 else if ((acc_balance >= min && acc_balance < (min + 5000.00)) && (acc_type == 'C' || acc_type == 'c'))
	 {

		intrest = (float) (acc_balance * 0.03);
		acc_balance = acc_balance + intrest;
		System.out.print("Intrest rate of 3% added to total balance");
		System.out.print("\n");
	 }
	 else if (acc_balance >= (min + 5000.00) && (acc_type == 'C' || acc_type == 'c'))
	 {
		intrest = (float) (acc_balance * 0.05);
		acc_balance = acc_balance + intrest;
		System.out.print("Intrest rate of 5% added to total balance");
		System.out.print("\n");
	 }
	 System.out.print("\n");
	 System.out.print("\n");
	 System.out.print("ACCOUNT NO.\tACCOUNT TYPE\tACCOUNT BALANCE");
	 System.out.print("\n");
	 System.out.print("--------------------------------------------------");
	 System.out.print("\n");
	 System.out.print(acc_no);
	 System.out.print("\t\t");
	 System.out.print(acc_type);
	 System.out.print("\t\t");
	 System.out.print(acc_balance);
	}

}
