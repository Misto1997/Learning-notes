
// Multithreading by implements Runnable Interface .

class first implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("\nEixt from : First");
	}
}
class second implements Runnable
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println("j = "+j);
		}
		System.out.println("Exit from : Second ");
	}
}
class third implements Runnable
{
	public void run()
	{
		for(int k=1;k<=10;k++)
		{
			System.out.println("k = "+k);
		}
		System.out.println("Exit from : Third");
	}
}
class Thread_Test1
{	
	public static void main(String args[])
	{
		first f = new first();
		second s  =new second();
		third t = new third();

		Thread t1 = new Thread(f);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();		

		System.out.println("Hello Java ");
	}
}



