package oop;

abstract class Bank 
{
	abstract void getBalance();
}
class BankA extends Bank
{
	void getBalance()
	{
		System.out.println("Balance is $100");
	}
}
class BankB extends Bank
{
	void getBalance()
	{
		System.out.println("Balance is $150");
	}
}
class BankC extends Bank
{
	void getBalance()
	{
		System.out.println("Balance is $200");
	}
}
public class B44
{
	public static void main(String[] args) 
	{
		Bank ob1 = new BankA();
		Bank ob2 = new BankB();
		Bank ob3 = new BankC();
		ob1.getBalance();
		ob2.getBalance();
		ob3.getBalance();
	}
}
