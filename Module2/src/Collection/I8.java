package Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class I8 
{
		public static void main(String[] args) 
		{
			  HashMap<Integer,String> hmap=new HashMap<Integer,String>();  
		      hmap.put(0,"Red"); 
		      if(hmap.size()>0) 
		    	  System.out.println("HashMap contains key-value pairs");
		      else
		    	  System.out.println("HashMap does not contain key-value pairs");
		      hmap.clear();
		      if(hmap.size()>0) 
		    	  System.out.println("HashMap contains key-value pairs");
		      else
		    	  System.out.println("HashMap does not contain key-value pairs");
		}
}