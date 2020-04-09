
/*
Suspending & Resuming the Threads :

java.lang.Thread 
- suspend()
- wait()

Thread Block :
- sleep(int ms)
- suspend() & resume()
- wait() & notify() & notifyAll()
- join()

Thread Synchronization :

*/

class newThread implements Runnable 
{
	Thread t;
	String tname;

	newThread(String name)
	{
		tname=name;
		t = new Thread(this,name);
		System.out.println(t);
		t.start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)	
		{
			System.out.println(tname+" = "+i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
			}
		}
		System.out.println("Exit from : "+tname);
	}
}

class s_resume
{
	public static void main(String args[])	throws Exception
	{
		newThread obj1 = new newThread("First");
		newThread obj2 = new newThread("Second");	
		
		Thread.sleep(600);
		System.out.println("\nSuspending Thread First.");
		obj1.t.suspend();

		Thread.sleep(600);
		System.out.println("\nResuming Thread First");
		obj1.t.resume();

		Thread.sleep(600);
		System.out.println("Suspending Thread Second");
		obj2.t.suspend();
	
		Thread.sleep(600);
		System.out.println("Resuming Thread Second");
		obj2.t.resume();

		Thread.sleep(4000);
		System.out.println("\n\n\nMain Thread Exit ");
	}
}

	

