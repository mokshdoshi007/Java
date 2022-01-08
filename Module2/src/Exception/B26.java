package Exception;

import java.util.Scanner;

public class B26 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter 2 Numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        try 
        {
            n3=n1/n2;
            System.out.println("Result: " + n3);
        }
        catch (ArithmeticException ae) 
        {
            System.out.println("/ by 0");
        }
    }
}