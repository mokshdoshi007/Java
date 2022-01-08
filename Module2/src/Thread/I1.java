package Thread;
 
class I1 extends Thread 
{ 
	public void run() 
	{ 
		System.out.println("Inside run method"); 
	} 
	public static void main(String[]args) 
	{ 
		I1 m1 = new I1(); 
		I1 m2 = new I1();
		m1.setName("mythread-1");
		m2.setName("mythread-2");
	 	m1.setPriority(Thread.MIN_PRIORITY); 
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
		System.out.println(m1.getName()+" thread priority: "+m1.getPriority());
		System.out.println(m2.getName()+" thread priority: "+m2.getPriority());
 		System.out.println("Main thread priority: "+Thread.currentThread().getPriority()); 
	} 
} 
