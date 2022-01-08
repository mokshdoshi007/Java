package string;

import java.util.Scanner;

public class B19
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter String 1: ");
		s1=sc.nextLine();
		System.out.println("Enter String 2: ");
		s2=sc.nextLine();
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
