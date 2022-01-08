package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class I3
{
		public static void main(String[] args) 
		{
			  Scanner sc = new Scanner(System.in);
			  int i,s,e;
			  String t;
			  ArrayList<String> list1=new ArrayList<String>();
			  ArrayList<String> list2=new ArrayList<String>();
			  list1.add("Red");    
		      list1.add("Blue");    
		      list1.add("Green");
		      list2.add("Red");    
		      list2.add("Blue");    
		      list2.add("Green");
		      if(list1.equals(list2)==true)
		    	  System.out.println("Lists are equal");
		      else
		    	  System.out.println("Lists are not equal");
		      list2.add("Yellow");
		      if(list1.equals(list2)==true)
		    	  System.out.println("Lists are equal");
		      else
		    	  System.out.println("Lists are not equal");
		      
		}
}