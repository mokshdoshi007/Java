package Exception;

public class B29 
{
	public static void main(int n1, int n2) 
    {
		int n3;
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