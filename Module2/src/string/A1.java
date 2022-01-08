package string;

import java.util.Scanner;

public class A1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		int i,j;
		boolean m;
		System.out.println("Enter a String: ");
		s=sc.nextLine();
		for(i=0; i<s.length(); i++)
		{
			m = false;
			for(j=i+1; j<s.length(); j++)
			{
				if(s.charAt(j)==s.charAt(i))
					{
					m=true;
					break;
					}
			}
			if(m==false)
			{
				System.out.println("The first non-repeated character in String is: "+s.charAt(i));
				break;
			}
		}
	}
}
