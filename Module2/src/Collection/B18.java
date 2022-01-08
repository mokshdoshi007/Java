package Collection;

import java.util.ArrayList;

public class B18
{
		public static void main(String[] args) 
		{
			  ArrayList<String> list=new ArrayList<String>();    
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green"); 
		      System.out.println("Original list: "+list);
		      list.remove(2);
		      System.out.println("Updated list: "+list);
		}
}