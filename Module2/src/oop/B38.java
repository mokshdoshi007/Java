package oop;

class father 
{
	void print()
	{
		System.out.println("This is father class");
	}
}
class child extends father
{
	void print()
	{
		System.out.println("This is child class");
		super.print();
	}
}
public class B38
{
	public static void main(String[] args) 
	{
		father ob1 = new father();
		child ob2 = new child();
		ob1.print();
		ob2.print();
	}
}