
// Testing the Java Exception Handling ...

class test
{
	public static void main(String args[])
	{
		int a,b,c;
		int x[] = new int[5];
		try
		{
			a=10;
			b=0;
			c=a/b;
			System.out.println("Hello Java");
		}
		/*catch(Exception e)
		{
			System.out.println("I am into Exception Block");
			try
			{
				System.out.println(x[8]);
			}
			catch(ArrayIndexOutOfBoundsException e1)	
			{
			System.out.println("Array Error handled.");
			}	
		}*/
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled : "+e);
			System.out.println(x[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Error .");
		}
		finally
		{
			System.out.println("I am into the finally block");
		}
		System.out.println("I am the last statement.");
	}
}




