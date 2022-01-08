package oop;

import java.util.Scanner;

public class I1 
{
	int Factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return (n*Factorial(n-1));
	}
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner (System.in);
		I1 ob = new I1();
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		System.out.println("Factorial of "+n+" is: "+ob.Factorial(n));
	}
}
