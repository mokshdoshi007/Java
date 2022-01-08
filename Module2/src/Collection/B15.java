package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class B15 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		ArrayList<String> list=new ArrayList<String>();    
	    list.add("Red");    
	    list.add("Blue");    
	    list.add("Green");
	    System.out.print("Enter Colour to attach at first position: ");
	    String s = sc.next(); 
	    list.add(0,s);
	    System.out.println("Updated list: "+list);
	}
}