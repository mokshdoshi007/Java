package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class I5
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
		      list2.add("Orange");    
		      list2.add("Pink");    
		      list2.add("Yellow");
		      System.out.println("List 1: "+list1);
		      System.out.println("List 2: "+list2);
		      list1.addAll(list2);
		      System.out.println("Merged List: "+list1);
		      
		}
}