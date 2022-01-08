package Thread;

public class B1 
{ 
	class runthread implements Runnable 
	{ 
		public void run() 
		{ 
			System.out.println("Executing method run()");
			System.out.println(Thread.currentThread().getName()); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		System.out.println("Main thread: "+Thread.currentThread().getName()); 
		Thread t1 = new Thread(new B1().new runthread()); 
		t1.start(); 
	}	
}