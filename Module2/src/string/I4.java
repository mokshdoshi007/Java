package string;

import java.util.Scanner;

public class I4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,max=0,max2=0;
		String s;
		int c[] = new int[256];
		System.out.println("Enter a String: ");
		s = sc.nextLine();
		for(i=0; i<s.length(); i++)
			c[s.charAt(i)]++;
		for (i=0; i<256; i++)
        {
        	if(c[i]>max)
        	{
        		max2=max;
        		max=c[i];
        	}
        	else if(max2<c[i] && c[i]<max)
        		max2=c[i];
        }
		if(max2!=0)
		{
		System.out.print("Characters with second most frequency:");
		for(i=0; i<256; i++)
		{	
			if(c[i]==max2)
			System.out.print(" "+(char)(i));
		}
		}
		else
			System.out.println("No character with second most frequency");
	}
}