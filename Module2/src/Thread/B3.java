package Thread;

public class B3 extends Thread 
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" started");
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException ex) 
		{
			ex.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ended");
	}

	public static void main(String args[]) 
	{
		B3 t1 = new B3();
		B3 t2 = new B3();
		t1.start();
		t2.start();
	}
}