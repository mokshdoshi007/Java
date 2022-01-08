package Collection;

import java.util.ArrayList;
import java.util.Hashtable;

public class B24 
{
		public static void main(String[] args) 
		{
			  Hashtable<Integer,String> list=new Hashtable<Integer,String>();  
		      list.put(0,"Red");    
		      list.put(1,"Blue");    
		      list.put(2,"Green"); 
		      for(int i=0; i<list.size(); i++)
		      System.out.print(list.get(i)+" ");  	
		}
}