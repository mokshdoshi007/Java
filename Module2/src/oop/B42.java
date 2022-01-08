package oop;

import java.util.Scanner;

class Complex
{
	int a,b,x,y;
	Complex(int p, int q, int r, int s)
	{
		a=p;
		b=q;
		x=r;
		y=s;
	}
	void sum()
    {
        System.out.println("Sum of 2 Complex Numbers: "+(a+x)+" + "+(b+y)+"i");
    }
    void difference()
    {
    	System.out.println("Difference of 2 Complex Numbers: "+(a-x)+" + "+(b-y)+"i");
    }
    void product()
    {
    	System.out.println("Product of 2 Complex Numbers: "+(a*x-b*y)+" + "+(b*x+y*a)+"i");
    }
}
public class B42 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,x,y;
		System.out.print("Enter real part of Complex Number 1: ");
		a=sc.nextInt();
		System.out.print("Enter imaginary part of Complex Number 1: ");
		b=sc.nextInt();
		System.out.print("Enter real part of Complex Number 2: ");
		x=sc.nextInt();
		System.out.print("Enter imaginary part of Complex Number 2: ");
		y=sc.nextInt();
		System.out.println();
		Complex ob = new Complex(a,b,x,y);
		ob.sum();
		ob.difference();
		ob.product();
	}
}
