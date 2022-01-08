package Collection;

import java.util.ArrayList;

public class A3 
{
		public static void main(String[] args) 
		{
			  ArrayList<String> list=new ArrayList<String>();    
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green");
		      System.out.println("Position\tElement");
		      for(int i=0; i<list.size(); i++)
		      System.out.println(i+"\t\t"+list.get(i));  	
		}
}