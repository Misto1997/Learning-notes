// Multithreading  by extends the Thread class.

class first extends Thread
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
class second extends Thread
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
class third extends Thread
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
class Thread_Test
{	
	public static void main(String args[])
	{
		first f = new first();
		second s  =new second();
		third t = new third();

		f.start();		
		s.start();
		t.start();

		System.out.println("Hello Java ");
	}
}



