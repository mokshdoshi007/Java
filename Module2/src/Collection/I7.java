package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class I7
{
	public static void main(String[] args) 
	{
		int i;
		HashSet<String> set = new HashSet<String>();    
	    set.add("Red");    
	    set.add("Blue");    
	    set.add("Green");
	    System.out.println("Set: "+set);
		ArrayList<String> list=new ArrayList<String>();
	    list.addAll(set);
	    System.out.print("List: "+list);
	}
}