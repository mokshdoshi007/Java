package string;

import java.util.Scanner;

public class I2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter String 1: ");
		s1=sc.nextLine();
		System.out.println("Enter String 2: ");
		s2=sc.nextLine();
		if(s1.startsWith(s2))
			System.out.println("True - String 1 starts with String 2");
		else
			System.out.println("False - String 1 does not start with String 2");
	}
}
