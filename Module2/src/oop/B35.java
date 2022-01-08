package oop;

public class B35 
{
void printn(int a)
{
	System.out.println("Integer is "+a);
}
void printn(float a)
{
	System.out.println("Float is "+a);
}
void printn(double a)
{
	System.out.println("Double is "+a);
}
void printn(char a)
{
	System.out.println("Character is "+a);	
}
void printn(String a)
{
	System.out.println("String is "+a);	
}
public static void main(String[] args) 
{
	B35 ob = new B35();
	ob.printn(1);
	ob.printn(2.35f);
	ob.printn(3.1416);
	ob.printn('m');
	ob.printn("moksh");
}
}
