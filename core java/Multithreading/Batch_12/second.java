// Creating 2 threads ...
class newThread implements Runnable
{
	Thread t;
	newThread()
	{
		t = new Thread(this);
		System.out.println(t);
		t.start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread : "+i);
		}
		System.out.println("\nExit from Child Thread.");
	}
}
class Thread_Test
{
	public static void main(String args[])
	{
		new newThread();		
		try
		{
			Thread.sleep(30);
		}
		catch(Exception e)
		{
		}
			
		System.out.println("Exit from Parent Thread.");
	}
}


