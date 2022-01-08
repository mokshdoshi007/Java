package Exception;

public class B27 
{
	public static void main(String[] args) 
    {
		int a[] = new int[5];
        try 
        {
            a[5]=0;
        }
        catch (ArrayIndexOutOfBoundsException ai) 
        {
            System.out.println("Array Index out of Bounds");
        }
        catch (ArithmeticException ae) 
        {
            System.out.println("/ by 0");
        }
    }
}