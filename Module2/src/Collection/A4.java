package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class A4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		HashSet<String> set1 = new HashSet<String>();    
		HashSet<String> set2 = new HashSet<String>();
	    set1.add("Red");    
	    set1.add("Blue");    
	    set1.add("Green");
	    set1.add("Violet");    
	    set2.add("Yellow");    
	    set2.add("Orange");
	    set2.add("Blue");    
	    set2.add("Red");
	    System.out.println("Set 1: "+set1);
	    System.out.println("Set 2: "+set2);
	    set1.retainAll(set2);
	    System.out.print("Common elements: "+set1);
	    
	}
}