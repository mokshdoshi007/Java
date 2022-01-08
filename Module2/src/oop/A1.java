package oop;

import java.util.Scanner;

class RBI
{
	float rateofinterest(float r) 
	{
		if(r<4)
			return 4;
		else
			return r;
	}
	int minimumbalance(int mb)
	{
		if(mb<2000)
			return 2000;
		else
			return mb;
	}
	int maximumwithdrawal(int mw)
	{
		if(mw>200000)
			return 200000;
		else
			return mw;
	}
}

class SBI extends RBI 
{
	float rateofinterest(float r) 
	{
		r=super.rateofinterest(r);
		return r;
	}
	int minimumbalance(int mb)
	{
		mb=super.minimumbalance(mb);
		return mb;
	}
	int maximumwithdrawal(int mw)
	{
		mw=super.maximumwithdrawal(mw);
		return mw;
	}
}

class ICICI extends RBI 
{
	float rateofinterest(float r) 
	{
		r=super.rateofinterest(r);
		return r;
	}
	int minimumbalance(int mb)
	{
		mb=super.minimumbalance(mb);
		return mb;
	}
	int maximumwithdrawal(int mw)
	{
		mw=super.maximumwithdrawal(mw);
		return mw;
	}
}
class PNB extends RBI 
{
	float rateofinterest(float r) 
	{
		r=super.rateofinterest(r);
		return r;
	}
	int minimumbalance(int mb)
	{
		mb=super.minimumbalance(mb);
		return mb;
	}
	int maximumwithdrawal(int mw)
	{
		mw=super.maximumwithdrawal(mw);
		return mw;
	}
}
public class A1 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		RBI b;
		float r;
		int mw,mb;
		
		b = new SBI();
		System.out.println("Set Rate of Interest for SBI: ");
		r=sc.nextFloat();
		r=b.rateofinterest(r);
		System.out.println("Set Minimum Balance for SBI: ");
		mb=sc.nextInt();
		mb=b.minimumbalance(mb);
		System.out.println("Set Maximum Withdrawal for SBI: ");
		mw=sc.nextInt();
		mw=b.maximumwithdrawal(mw);
		System.out.println("Rate of Interest for SBI: "+r);
		System.out.println("Minimum Balance for SBI: "+mb);
		System.out.println("Maximum Withdrawal for SBI: "+mw);
		
		b = new ICICI();
		System.out.println("Set Rate of Interest for ICICI: ");
		r=sc.nextFloat();
		r=b.rateofinterest(r);
		System.out.println("Set Minimum Balance for ICICI: ");
		mb=sc.nextInt();
		mb=b.minimumbalance(mb);
		System.out.println("Set Maximum Withdrawal for ICICI: ");
		mw=sc.nextInt();
		mw=b.maximumwithdrawal(mw);
		System.out.println("Rate of Interest for ICICI: "+r);
		System.out.println("Minimum Balance for ICICI: "+mb);
		System.out.println("Maximum Withdrawal for ICICI: "+mw);
		
		b = new PNB();
		System.out.println("Set Rate of Interest for PNB: ");
		r=sc.nextFloat();
		r=b.rateofinterest(r);
		System.out.println("Set Minimum Balance for PNB: ");
		mb=sc.nextInt();
		mb=b.minimumbalance(mb);
		System.out.println("Set Maximum Withdrawal for PNB: ");
		mw=sc.nextInt();
		mw=b.maximumwithdrawal(mw);
		System.out.println("Rate of Interest for PNB: "+r);
		System.out.println("Minimum Balance for PNB: "+mb);
		System.out.println("Maximum Withdrawal for PNB: "+mw);
	}
}