package Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class A5 
{
		public static void main(String[] args) 
		{
			  HashMap<Integer,String> list=new HashMap<Integer,String>();  
		      list.put(0,"Red");    
		      list.put(1,"Blue");    
		      list.put(2,"Green"); 
		      for(int i=0; i<list.size(); i++)
			      System.out.print(list.get(i)+" ");
		}
}