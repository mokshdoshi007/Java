package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class B26 
{
		public static void main(String[] args) 
		{
			  int k;
			  String v;
			  Scanner sc = new Scanner(System.in);
			  HashMap<Integer,String> hmap=new HashMap<Integer,String>();  
		      int ch=1;
		      while(ch!=0)
		      {
		    	  System.out.print("Enter key: ");
		    	  k=sc.nextInt();
		    	  System.out.print("Enter value: ");
		    	  v=sc.next();
		    	  hmap.put(k,v);  
		    	  System.out.print("Do you want to add another element? (1=Yes 0=No) ");
		    	  ch=sc.nextInt();
		      }
		      System.out.println("Required HashMap: "+hmap);   	
		}
}