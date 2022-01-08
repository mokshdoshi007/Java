package Exception;

import java.util.Scanner;
class NotinRangeException extends Exception{}
public class I1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int i;
		int n[] = new int[10];
		System.out.println("Enter 10 Numbers:");
        try 
        {
        	for(i=0; i<10; i++)
            {
            	n[i]=sc.nextInt();
            	if(n[i]<10 || n[i]>40)
            		throw new NotinRangeException();
            }
        	System.out.print("Entered 10 Numbers:");
        	for(i=0; i<10; i++)
        		System.out.print(" "+n[i]);
        }
        catch (NotinRangeException ae) 
        {
            System.out.println("Number should be between 10 and 40");
        }
    }
}