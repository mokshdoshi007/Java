package oop;

public class B36 
{
void printn(int n, char c)
{
	System.out.println("Integer is "+n+" and Character is "+c);
}
void printn(char c, int n)
{
	System.out.println("Character is "+c+" and Integer is "+n);
}
public static void main(String[] args) 
{
	B36 ob = new B36();
	ob.printn(1,'m');
	ob.printn('m',1);
}
}
