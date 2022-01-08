package Thread;

class B2 extends Thread 
{
	public void run() 
	{
		System.out.println("Thread is running");
	}

	public static void main(String args[]) 
	{
		B2 t1 = new B2();
		t1.start();
	}
}