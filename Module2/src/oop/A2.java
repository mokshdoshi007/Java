package oop;

class AA
{
	static void message()
	{
		System.out.println("Parent");
	}
}
class BB extends AA
{
	static void message()
	{
		System.out.println("Child");
	}
}
public class A2
{
	public static void main(String[] args) 
	{
		AA ob1 = new AA();
		BB ob2 = new BB();
		AA ob3 = new BB();
		ob1.message();
		ob2.message();
		ob3.message();
	}
}
