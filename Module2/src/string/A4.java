package string;

import java.util.Scanner;

public class A4 
{
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	String s1,s2;
	System.out.println("Enter a String: ");
	s1=sc.nextLine();
	s2=s1.replaceAll("is", "is not");
	System.out.println("The new String is: "+s2);
	}
}
