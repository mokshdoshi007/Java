package oop;

abstract class Parent 
{
	void message()
	{
		System.out.println("This is parent class");
	}
}
class child1 extends Parent
{
	void message()
	{
		System.out.println("This is first subclass");
		super.message();
	}
}
class child2 extends Parent
{
	void message()
	{
		System.out.println("This is second subclass");
		super.message();
	}
}
public class B43
{
	public static void main(String[] args) 
	{
		child1 ob1 = new child1();
		child2 ob2 = new child2();
		ob1.message();
		ob2.message();
	}
}
