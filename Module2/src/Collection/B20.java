package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class B20
{
		public static void main(String[] args) 
		{
			  ArrayList<String> list=new ArrayList<String>();    
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green"); 
		      System.out.println("Original list: "+list);
		      Collections.sort(list);
		      System.out.println("Sorted list: "+list);
		}
}