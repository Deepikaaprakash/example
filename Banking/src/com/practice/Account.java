package com.practice;

public class Account
{
	int accno;
	String name;
	double amount;
	
	void insert(int ac,String n,double amt)
	{
		accno=ac;
		name=n;
		amount=amt;
	}
	
	void deposit(double amt)
	{
		amount=amount+amt;
	}
	void withdraw(double amt)
	{
		if(amount<amt)
		{
			System.out.println("Amount insufficient");
		}
		else
		{
			System.out.println("amount withdrawn");
		}
	}
	void checkbalance()
	{
		System.out.println("balance is:"+ amount);
	}
	void detailsdisplay()
	{
		System.out.println("account no is:"+accno +"amount is:"+amount);
		
	}
	
}
