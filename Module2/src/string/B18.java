package string;

import java.util.Scanner;

public class B18
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		System.out.println("Enter String 1: ");
		s1=sc.nextLine();
		System.out.println("Enter String 2: ");
		s2=sc.nextLine();
		s3=s1.concat(s2);
		System.out.println("Concated String: "+s3);
	}
}
