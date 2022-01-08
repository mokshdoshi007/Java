package Collection;

import java.util.ArrayList;

public class I1
{
		public static void main(String[] args) 
		{
			  int i,n;
			  String t;
			  ArrayList<String> list=new ArrayList<String>();
			  list.add("Red");    
		      list.add("Blue");    
		      list.add("Green");
		      list.add("Orange");
		      n=list.size();
		      System.out.println("Original list: "+list);
		      for(i=0; i<n/2; i++)
		      {
		    	  	t=list.get(i);
		    	  	list.set(i, list.get(n-i-1));
		    	  	list.set(n-i-1, t);
		      }
		      System.out.println("Reversed list: "+list);
		}
}