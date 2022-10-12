package com.practice;

public class TestAccount 
{
	public static void main(String[] args) 
	{
		Account a= new Account();
		a.insert(978932, "deeps", 8990);
		a.detailsdisplay();
		a.checkbalance();
		a.deposit(79090);
		a.checkbalance();
		a.withdraw(900000);
		a.checkbalance();
	}
}
