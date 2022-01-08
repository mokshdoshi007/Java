package string;

import java.util.Scanner;

public class A2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		int i,j;
		System.out.println("Enter a String: ");
		s=sc.nextLine();
		for(i=s.length()/2; i>=0; i--)
		{
			if(s.length()%i==0)
				break;
		}
		System.out.println("The string divided into "+(s.length()/i)+" parts and they are:");
		for(j=0; j<s.length(); j+=i)
			System.out.println(s.substring(j,j+i));
	}
}
