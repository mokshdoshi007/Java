package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class I6
{
	public static void main(String[] args) 
	{
		int i;
		HashSet<String> set = new HashSet<String>();    
	    set.add("Red");    
	    set.add("Blue");    
	    set.add("Green");
	    System.out.println("Set: "+set);
	    String s[] = new String[set.size()];
	    set.toArray(s);
	    System.out.print("Array: ");
	    for(String x: s)
	    	System.out.print(" "+x);
	}
}