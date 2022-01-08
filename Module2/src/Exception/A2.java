package Exception;

import java.util.Scanner;
class AgeNotWithinRangeException extends Exception{}
class NameNotValidException extends Exception{}

class Student
{
	int roll,age;
	String name,course;
	Student(int r,int a,String n,String c)
	{
		roll=r;
		age=a;
		name=n;
		course=c;
	}
	void checkAge()
	{
		try
		{
			if(!(age>=15 && age<=21))
					throw new AgeNotWithinRangeException();
		}
		catch (AgeNotWithinRangeException ae) 
		{
		    System.out.println("Age is not between 15 and 21");
		    age=0;
		}
	}
	void checkName()
	{
		try 
		{
			for(int i=0; i<name.length(); i++)
			{
				if(!(Character.isLetter(name.charAt(i))))
					throw new NameNotValidException();
			}
		}
		catch (NameNotValidException ae) 
		{
		    System.out.println("NameNotValidException");	
		    name=null;
		}
	}
	void print()
	{
		System.out.println("Roll\tName\tAge\tCourse");
		System.out.println("------------------------------");
		System.out.println(roll+"\t"+name+"\t"+age+"\t"+course);
	}
}
public class A2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int r,a;
		String n,c;
		System.out.print("Enter Roll No: ");
		r=sc.nextInt();
		System.out.print("Enter Name: ");
		n=sc.next();
		System.out.print("Enter Age: ");
		a=sc.nextInt();
		System.out.print("Enter Course: ");
		c=sc.next();
		Student ob = new Student(r,a,n,c);
		ob.checkName();
		ob.checkAge();
		ob.print();
	}
}