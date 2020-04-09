
// Creating Double Classes ...

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
		System.out.println("Exit from Child Thread");
	
	}

}

class second
{
	public static void main(String args[])	throws Exception
	{
		new newThread();

		Thread.sleep(10);

		System.out.println("\n\nExit from main thread.");
	}
}
