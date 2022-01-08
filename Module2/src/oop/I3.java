package oop;

import java.util.Scanner;

public class I3 
{
	static void grade(int m)
	{
		if(m>90)
			System.out.print("AA");
		else if(m>80 && m<91)
			System.out.print("AB");
		else if(m>70 && m<81)
			System.out.print("BB");
		else if(m>60 && m<71)
			System.out.print("BC");
		else if(m>50 && m<61)
			System.out.print("CD");
		else if(m>40 && m<51)
			System.out.print("DD");
		else
			System.out.print("Fail");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks out of 100: ");
		int marks = sc.nextInt();
		System.out.println("Grade is:");
		grade(marks);
	}
}
