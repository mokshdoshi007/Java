package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class B25
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		HashSet<String> set = new HashSet<String>();    
	    set.add("Red");    
	    set.add("Blue");    
	    set.add("Green");
	    System.out.println("Number of elements in set: "+set.size());
	}
}