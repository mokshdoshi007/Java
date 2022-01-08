package Thread;

public class I2 extends Thread
{
   public void run()
   {
	   if(Thread.currentThread().isDaemon()) 
	      System.out.println("Daemon thread executing");  
	   else  
	      System.out.println("Normal thread executing");       
   }  
   public static void main(String[] args)
   { 
	   I2 t1=new I2();
	   I2 t2=new I2();   
	   t1.start();
	   t1.setDaemon(true);
       t2.start();  
   } 
}