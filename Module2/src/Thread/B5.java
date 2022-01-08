package Thread;

class B5 extends Thread 
{
	public void run() 
	{
		System.out.println("Thread is running");
	}

	public static void main(String args[]) 
	{
		B5 t1 = new B5();
		B5 t2 = new B5();
		t1.run();
		t2.run();
	}
}