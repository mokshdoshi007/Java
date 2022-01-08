package Thread;

class B4 extends Thread 
{
	public void run() 
	{
		System.out.println("Thread is running");
	}

	public static void main(String args[]) 
	{
		B4 t1 = new B4();
		t1.start();
		t1.start();
	}
}