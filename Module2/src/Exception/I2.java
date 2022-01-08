package Exception;

import java.util.Scanner;
public class I2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int a;
		try
		{
			System.out.print("Enter Your Age: ");
			a=sc.nextInt();
			if(a<18)
				throw new ArithmeticException();
			System.out.println("Welcome to Vote");
		}
        catch (ArithmeticException ae) 
        {
            System.out.println("Minimum Age should be 18 to vote");
        }
    }
}