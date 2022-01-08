package Exception;

import java.util.Scanner;
class LowBalanceException extends Exception{}
public class A1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int balance=2000;
		int wa=0;
		try
		{
			System.out.print("Enter Amount to Withdraw: ");
			wa=sc.nextInt();
			if(wa>balance)
				throw new LowBalanceException();
			System.out.println("Withdrawal Successful, Updated Balance: "+(balance-wa));
		}
        catch (LowBalanceException ae) 
        {
            System.out.println("Sorry, insufficient balance, you need more "+(wa-balance)+" Rs.");
            System.out.println("To perform this transaction.");
        }
    }
}