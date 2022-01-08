package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class B16 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		ArrayList<String> list=new ArrayList<String>();    
	    list.add("Red");    
	    list.add("Blue");    
	    list.add("Green");
	    System.out.print("Enter index to find element: ");
	    int s = sc.nextInt();
	    System.out.println("Element at index "+s+" is "+list.get(s));
	}
}
