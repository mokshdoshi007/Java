package Thread;
 
class MyRunnable extends Thread 
{ 
	public void run()
	{ 
		try 
		{
			Thread.sleep(10);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Thread "+Thread.currentThread().getName()+" stopped"); 
	} 
} 
public class A1 
{ 
	public static void main(String arg[])
	{ 
 		ThreadGroup tg1 = new ThreadGroup("Group A");  
 		Thread t1 = new Thread(tg1, new MyRunnable(), "one"); 
 		Thread t2 = new Thread(tg1, new MyRunnable(), "two");
 		Thread t3 = new Thread(tg1, new MyRunnable(), "three");
 		t1.start();
 		t2.start();
 		t3.start(); 
 		System.out.println("Thread " + t1.getName()+" started"); 
 		System.out.println("Thread " + t2.getName()+" started");
		System.out.println("Thread " + t3.getName()+" started"); 
		System.out.println("Thread "+tg1.getName()+":");
		tg1.list();
		
	} 
} 
