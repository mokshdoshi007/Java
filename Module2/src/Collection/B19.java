package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class B19
{
		public static void main(String[] args) 
		{
			  Scanner sc = new Scanner(System.in);
			  ArrayList<String> list=new ArrayList<String>();    
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green"); 
		      System.out.print("Enter an element to find in list: ");
		      String s = sc.next();
		      if(list.contains(s)==true)
		    	  System.out.println(s+" is present");
		      else
		    	  System.out.println(s+" is not present");
		}
}