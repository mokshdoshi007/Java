package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class B22
{
		public static void main(String[] args) 
		{
			  ArrayList<String> list=new ArrayList<String>();    
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green"); 
		      System.out.println("Original list: "+list);
		      Collections.shuffle(list);
		      System.out.println("Shuffled list: "+list);
		}
}