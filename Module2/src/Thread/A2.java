package Thread;

class First extends Thread
{
	public void display(String msg) 
	{
		System.out.print("["+msg);
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Second extends First 
{
	String msg;
	First fobj;
	Second(First f, String s) 
	{
		fobj = f;
		msg = s;
		start();
	}
	public void run() 
	{
		synchronized (fobj)
		{
			fobj.display(msg);
		}
	}
}
public class A2 
{
	public static void main(String[] args) 
	{
		First fnew = new First();
		Second ss = new Second(fnew,"welcome");
		Second ss1 = new Second(fnew,"new");
		Second ss2 = new Second(fnew,"programmer");
	}
}