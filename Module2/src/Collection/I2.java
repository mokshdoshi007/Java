package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class I2
{
		public static void main(String[] args) 
		{
			  Scanner sc = new Scanner(System.in);
			  int i,s,e;
			  String t;
			  ArrayList<String> list=new ArrayList<String>();
			  list.add("Red");    
		      list.add("Blue");    
		      list.add("Green");
		      list.add("Orange");
		      System.out.print("Enter starting index: ");
		      s=sc.nextInt();
		      System.out.print("Enter ending index: ");
		      e=sc.nextInt();
		      if(s>=0 && e<list.size())
		      {
		    	  System.out.print("Extraction from list:");
		    	  for(i=s; i<=e; i++)
		    		  System.out.print(" "+list.get(i));
		      }
		      else
		    	  System.out.println("Invalid indices");
		}
}