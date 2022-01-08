package oop;

class Shapee 
{
	void message1()
	{
		System.out.println("This is Shape");
	}
}
class Rectanglee extends Shapee
{
	void message2()
	{
		System.out.println("This is Rectangular Shape");
	}
}
class Circlee extends Shapee
{
	void message3()
	{
		System.out.println("This is Circular Shape");
	}
}
class Squaree extends Rectanglee
{
	void message4()
	{
	System.out.println("Square is a Rectangle");
	}
}
public class I4
{
	public static void main(String[] args) 
	{
		Squaree ob1 = new Squaree();
		Circlee ob2 = new Circlee();
		ob1.message1();
		ob1.message2();
		ob2.message3();
		ob1.message4();
	}
}