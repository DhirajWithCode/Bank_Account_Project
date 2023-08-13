package com.bank;

import java.net.NoRouteToHostException;
import java.nio.channels.Channels;
import java.security.interfaces.RSAKey;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import org.w3c.dom.ls.LSOutput;

 class MyBank
{
   MyAccount b;
   static long accountno, phone;
   String bankName,branchName, address;
   Scanner sc = new Scanner(System.in);
   
   MyBank(String bankName, String branchName, String address)
   {
	   this.bankName = bankName;
	   this.branchName= branchName;
	   this.address=address;
   }
   public void createAccount() 
   {
	  long a= ThreadLocalRandom.current().nextLong(1000) ;
	  accountno = a*a*a;
	  String ifsc = "SBIN0001110";
	  Scanner sc = new Scanner(System.in);
	  System.out.println();
	  System.out.println("Enter Your Name : ");
	  String name = sc.nextLine();
	  System.out.println("Enter Phone No :");
	  phone = sc.nextLong();
	  System.out.println("Your Account No. is "+ accountno);
	  System.out.println("Your IFSC code is :"+ifsc);
	  System.out.println("Enter fist Amount: ");
	  double bal = sc.nextDouble();
	  System.out.println("Set Your pin :");
	  int pin = sc.nextInt();
	  b = new MyAccount(name, ifsc , accountno, phone , bal, pin);
	  System.out.println("Account create Successfully");
	  System.out.println();
   }
   public void removeAccount()
   {
	   System.out.println();
	   if(b!= null)
	   {
		  System.out.println("Enter Your Account No. Or phone no :");
		  long accountno=sc.nextLong();
		  if (accountno==b.getAccountno()|| accountno== b.getPhone())
		  {
			  System.out.println("Enter your pin :");
			  int pin = sc.nextInt();
			  if(b.getPin()==pin)
			  {
				  b=null;
				  System.out.println("your account deleted Sucessfully");
			  }
			  else
			  {
				 System.out.println("Enter PIN is wrong"); 
			  }
		  }
		  else {
			System.out.println("Enter Account No Doesn't exist");
		}
	   }
	   System.out.println();
   }
   public void deposite() 
   {
	  System.out.println();
	  if(b!=null)
	  {
		  System.out.println("Enter Your Account No Or phone no :");
		  long accountno= sc.nextLong();
		  if(accountno==b.getAccountno()||accountno==b.getPhone())
		  {
			  System.out.println("Account hold name is :"+ b.getName());
			  System.out.println("Press 1 to continue and press 2 to exit");
			  int press = sc.nextInt();
			  if(press==1)
			  {
				  System.out.println("Enter the amount to deposite : ");
				  double amount = sc.nextDouble();
				  if(accountno == b.getAccountno())
				  {
					  double newBal = b.getBal()+amount;
					  b.setBal(newBal);
					  System.out.println("The"+amount+"Rs added Sucessfully");
				  }
			  }
			  
		  }else {
			System.out.println("Enter Account No is worng");
		}
	  }else {
		  System.out.println("First you have to create the bank account ");
	}
	  System.out.println();
}
   public void withdraw() 
   {
	System.out.println();
	if(b!=null)
	{
		System.out.println("Enter Your Account No. Or Phone No");
		long accontno= sc.nextLong();
		if(accountno == b.getAccountno() || accountno == b.getPhone())
		{
			System.out.println("Enter the amount to withdraw:");
			double amount= sc.nextDouble();
			System.out.println("Enter the PIN :");
			int pin = sc.nextInt();
			if(b.getBal()>=amount)
			{
				if(pin==b.getPin())
				{
					System.out.println(amount+"debit Sucessfully");
					double newbal=b.getBal()-amount;
					b.setBal(newbal);
				}
				else {
					System.out.println("Enter PIN is wrong");
				}
			}
			
			else {
				System.out.println("Enter Amount is more than Bank Balaneces");
			}
		}
		else {
			System.out.println("Enter Account NO. doensn't exist");
		}
	}
	
	else {
		  System.out.println("First you have to create the Bank Account"); 
	   }
	System.out.println();
}
 public void bal() {
	System.out.println();
	if(b!=null)
	{
		System.out.println("Enter Your Account No. Phone no :");
		long accountno = sc.nextLong();
		if(accountno == b.getAccountno() || accountno == b.getPhone())
		{
			System.out.println("Enter Your PIN :");
			int pin = sc.nextInt();
			if(pin==b.getPin())
			{
				System.out.println("Your Account Balance is : "+ b.getBal());
			}
			else {
				System.out.println("Enter PIN is wrong");
			}
		}else {
			System.out.println("The Enter Account No doesn,t exist");
		}
	}
	else {
		System.out.println("First You have to create the bank account");
	}
	System.out.println();
}  
 
}
 
