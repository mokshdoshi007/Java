package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class B17
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		ArrayList<String> list=new ArrayList<String>();    
	    list.add("Red");    
	    list.add("Blue");    
	    list.add("Green");
	    System.out.print("Enter element: ");
	    String s = sc.next();
	    System.out.print("Enter index to update element: ");
	    int i = sc.nextInt();
	    list.set(i,s);
	    System.out.println("Updated list: "+list);
	}
}