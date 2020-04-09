// Synchronization....

class callme
{
	void call(String msg)
	{
		System.out.println("[" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}

		System.out.println("]");
	}

}

class caller implements Runnable
{

	String msg;
	callme target;
	Thread t;

	public caller(callme targ,String s)
	{
		target=targ;
		msg=s;
		t = new Thread(this);
		t.start();
	}

	public void run()
	{
		target.call(msg);
	}
	


}

class synchro1
{

	public static void main(String args[])
	{
		callme target = new callme();
		caller ob1 = new caller(target, "Hello");
		caller ob2 = new caller(target, "Synchronized");
		caller ob3 = new caller(target, "Word");
	}

}
	