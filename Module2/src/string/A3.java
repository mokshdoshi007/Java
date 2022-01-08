package string;

import java.util.Scanner;

public class A3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i;
		String s;
		int c[] = new int[256];
		System.out.println("Enter a String: ");
		s = sc.nextLine();
		for(i=0; i<s.length(); i++)
			c[s.charAt(i)]++;	
		System.out.println("The duplicate characters and counts are:");
		for(i=0; i<256; i++)
		{	
			if(c[i]>1)
			System.out.println((char)(i)+" appears "+c[i]+" times");
		}
	}
}