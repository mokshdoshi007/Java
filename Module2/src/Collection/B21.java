package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class B21
{
		public static void main(String[] args) 
		{
			  ArrayList<String> list=new ArrayList<String>();
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green"); 
		      System.out.println("Original list: "+list);
		      ArrayList<String> list2=(ArrayList<String>)list.clone();
		      System.out.println("Copied list: "+list2);
		}
}