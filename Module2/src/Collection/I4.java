package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class I4
{
		public static void main(String[] args) 
		{
			  Scanner sc = new Scanner(System.in);
			  int e,s;
			  String t;
			  ArrayList<String> list=new ArrayList<String>();
			  list.add("Red");    
		      list.add("Blue");    
		      list.add("Green");
		      list.add("Orange");
		      System.out.println("Original list: "+list);
		      System.out.print("Enter index 1 to swap element: ");
		      s=sc.nextInt();
		      System.out.print("Enter index 2 to swap element: ");
		      e=sc.nextInt();
		      if(s>=0 && s<list.size() && e>=0 && e<list.size())
		      {
		    	  	t=list.get(s);
		    	  	list.set(s, list.get(e));
		    	  	list.set(e, t);
		    	  	System.out.println("Updated list: "+list);
		      }
		      else
		    	  System.out.println("Invalid indices");
		}
}