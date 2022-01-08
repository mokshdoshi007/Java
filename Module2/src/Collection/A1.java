package Collection;

import java.util.ArrayList;

public class A1
{
		public static void main(String[] args) 
		{
			  ArrayList<String> list=new ArrayList<String>();    
		      list.add("Red");    
		      list.add("Blue");    
		      list.add("Green");
		      System.out.println("List: "+list);
		      list.ensureCapacity(10);
		      System.out.println("List can now store 10 elements");
		}
}