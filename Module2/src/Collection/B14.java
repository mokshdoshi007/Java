package Collection;

import java.util.ArrayList;

public class B14 
{
		public static void main(String[] args) 
		{
			  ArrayList<String> list=new ArrayList<String>();    
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green"); 
		      for(int i=0; i<list.size(); i++)
		      System.out.print(list.get(i)+" ");  	
		}
}