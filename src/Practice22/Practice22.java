/*
 * Title: Practice 22
 * Name: Ezekiel P. Villadolid
 * Description: a program that calculates a customer’s bill for a local cable company. There are two types of customers: residential and business.
 * Date: 4/19/2021
 */
package Practice22;

import java.util.Scanner;

public class Practice22 {

    //Named constants - residential customers
    final static double RES_BILL_PROC_FEES = 4.50;
    final static double RES_BASIC_SERV_COST = 20.50;
    final static double RES_COST_PREM_CHANNEL = 7.50;

    //Named constants - business customers
    final static double BUS_BILL_PROC_FEES = 15.00;
    final static double BUS_BASIC_SERV_COST = 75.00;
    final static double BUS_BASIC_CONN_COST = 5.00;
    final static double BUS_COST_PREM_CHANNEL = 50.00;

    public static void main(String[] args){
        //Variable Dcelaration
        int accountNumber;
        char customerType;
        int numOfPremChannels;
        int numOfBasicServConn;
        double amountDue;

        Scanner detector = new Scanner(System.in);   

        //To get the account number
        System.out.println("=====================");
        System.out.println("This program computes a cable bill.");
        System.out.print("Enter account number (an integer): ");
        accountNumber = detector.nextInt();

        //To get the customers type
        System.out.println("R or r (Residential) ");
        System.out.println("B or b (Business)");
        System.out.println("Enter customer type: ");
        customerType = detector.next().charAt(0);

        //To check if customers type
        switch (customerType){

            case 'r':
            case 'R':
                //To get the premium channerls
                System.out.print("Enter the number of premium channels:");
                numOfPremChannels = detector.nextInt();

                //To calculate the total cost
                amountDue = RES_BILL_PROC_FEES + RES_BASIC_SERV_COST + (numOfPremChannels * RES_COST_PREM_CHANNEL);

                System.out.println("=====================");
                System.out.printf("Account Number: ");
                System.out.printf("%d \n", accountNumber);
                System.out.printf("Amount Due: $");
                System.out.printf("%.2f \n", amountDue);
                System.out.println("=====================");
                break;

            case 'b':
            case 'B':
                System.out.printf("Enter number of basic service connections: ");
                numOfBasicServConn = detector.nextInt();
                System.out.printf("Enter number of premium channels: ");
                numOfPremChannels = detector.nextInt();

                if (numOfBasicServConn <= 10){
                    amountDue = (numOfPremChannels * BUS_COST_PREM_CHANNEL) + BUS_BILL_PROC_FEES + BUS_BASIC_SERV_COST;
                }
                else{
                    amountDue = BUS_BILL_PROC_FEES + BUS_BASIC_SERV_COST + (numOfBasicServConn - 10) * BUS_BASIC_CONN_COST + numOfPremChannels * BUS_COST_PREM_CHANNEL;
                }
                System.out.println("=====================");
                System.out.printf("Account Number: ");
                System.out.printf("%d \n", accountNumber);
                System.out.printf("Amount Due: $");
                System.out.printf("%.2f \n", amountDue);
                System.out.println("=====================");
                break;

            default:
                System.out.println("Invalid customer type");
        }
     }
}

