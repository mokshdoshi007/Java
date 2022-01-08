package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class B23
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		HashSet<String> set = new HashSet<String>();    
	    set.add("Red");    
	    set.add("Blue");    
	    set.add("Green");
	    System.out.print("Enter Colour to append to set: ");
	    String s = sc.next(); 
	    set.add(s);
	    System.out.println("Updated set: "+set);
	}
}