package oop;

abstract class Marks 
{
	abstract void getPercentage();
}
class A extends Marks
{
	int sub1,sub2,sub3;
	A(int s1, int s2, int s3)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
	}
	void getPercentage() 
	{
		System.out.println("Percentage of A: "+(double)(sub1+sub2+sub3)/3);
	}
}
class B extends Marks
{
	int sub1,sub2,sub3,sub4;
	B(int s1, int s2, int s3, int s4)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
	}
	void getPercentage() 
	{
		System.out.println("Percentage of B: "+(double)(sub1+sub2+sub3+sub4)/4);
	}
}
public class B45
{
	public static void main(String[] args) 
	{
		Marks ob1 = new A(70,81,90);
		Marks ob2 = new B(70,80,90,100);	
		ob1.getPercentage();
		ob2.getPercentage();
	}
}
