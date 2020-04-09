// Creating multiple threads by using single child thread class.


/*
new Thread();
new Thread(Runnable)
new Thread(String)
new Thread(Runnable,String)

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
			System.out.println(tname +" : "+i);
		}
		System.out.println("Exit from : "+tname);
	
	}

}

class multi_Thread
{
	public static void main(String args[])	throws Exception
	{
		new newThread("First");
		new newThread("Second");
		new newThread("Third");

		Thread.sleep(10);

		System.out.println("\n\nExit from main thread.");
	}
}
