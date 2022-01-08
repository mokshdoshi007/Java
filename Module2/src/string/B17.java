package string;

import java.util.Scanner;

public class B17 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		System.out.println("Enter a String: ");
		s=sc.nextLine();
		System.out.println("Enter index to find character: ");
		i=sc.nextInt();
		if(i>=0 && i<s.length())
			System.out.println("Character at index "+i+" is "+s.charAt(i));
		else
			System.out.println("Invalid index");
	}
}
