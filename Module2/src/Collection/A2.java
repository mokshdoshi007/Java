package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class A2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		ArrayList<String> list=new ArrayList<String>();    
	    list.add("Red");    
	    list.add("Blue");    
	    list.add("Green");
	    System.out.println("Original list: "+list);
	    System.out.print("Enter element: ");
	    String s = sc.next();
	    list.set(1,s);
	    System.out.println("Updated list: "+list);
	}
}