package com.bank;

import java.util.Iterator;
import java.util.Scanner;

public class MyDriver 
{
    public static void main(String[] args)
    {
		Scanner sc= new Scanner(System.in);
		String bankName = "State Bank Of India";
	        String branchName ="Shivajinagr,PUNE";
		String add ="near M.N.P.";
		MyBank b = new MyBank(bankName,branchName, add);
		
		System.out.println("***** WELCOME *****");
	    
		System.out.println();
		System.out.println("BANK NAME :"+bankName);
		System.out.println("BRANCH NAME :"+branchName);
		System.out.println("Address :"+add);
		System.out.println();
		System.out.println("Select From Below Option");
		
		for(;;)
		{
			System.out.println("1. Create Account");
			System.out.println("2. Remove Account");
			System.out.println("3. Deposite Cash");
			System.out.println("4. Withdraw Cash");
			System.out.println("5. Check Account Balace");
			System.out.println("6. Exit");
			System.out.println();
			System.out.print("Enter the option :");
			int option = sc.nextInt();
			
		    switch(option)
		    {
		    case 1: b.createAccount(); break;
		    case 2: b.removeAccount();break;
		    case 3: b.deposite();break;
		    case 4: b.withdraw();break;
		    case 5: b.bal();break;
		    case 6: System.out.println("You Have Exited ");
		       System.exit(0);
		    }
		}
		
	}
}
