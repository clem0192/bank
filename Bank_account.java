package com.company;

import java.util.Scanner;

public class Bank_account {
    public String account_owner;
    public int account_number;
    public double account_balance;

    public void initialize_account() {
        System.out.println("Enter account number : ");
        Scanner input = new Scanner(System.in);

        account_number = input.nextInt();

        System.out.println("Enter account owner : ");
        Scanner input1 = new Scanner(System.in);

        account_owner = input.next();

        System.out.println("Enter account balance : ");
        Scanner input2 = new Scanner(System.in);

        account_balance = input.nextDouble();



    }

    public void show_account_data() {
        System.out.println("\n\nB A N K   A C C O U N T   D A T A : "
                + "\n   Account owner :  " + account_owner
                + "\n   Account number:  " + account_number
                + "\n   Current balance: " + account_balance);

    }

    public void transaction(){
        System.out.println("Enter amount to deposit : ");
        Scanner input = new Scanner(System.in);
        double amount_to_deposit;
        amount_to_deposit = input.nextDouble();


        System.out.print( "\n\nTRANSACTION FOR ACCOUNT OF " +  account_owner
                +  " (Account number " +  account_number  + ")" ) ;
        System.out.print( "\n   Amount deposited: "  +  amount_to_deposit
                +  "\n   Old account balance: "  +  account_balance ) ;
        account_balance  =  account_balance  +  amount_to_deposit ;
        System.out.print( "   New balance: "  +  account_balance  ) ;
    }

}








