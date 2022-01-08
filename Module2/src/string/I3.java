package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I3 
{
	public static void il(String m, String s1, String s2, Set<String> result) 
	{
		if (s1.length() == 0 && s2.length() == 0)
			result.add(m);
		if (s1.length()>0)
			il(m+s1.charAt(0), s1.substring(1), s2, result);
		if (s2.length()>0)
			il(m+s2.charAt(0), s1, s2.substring(1), result);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter String 1: ");
		s1 = sc.nextLine();
		System.out.println("Enter String 2: ");
		s2 = sc.nextLine();
		Set<String> result = new HashSet<>();
		il("", s1, s2, result);
		System.out.println("The interleaving strings are:");
		for (String m : result)
			System.out.println(m);
	}
}