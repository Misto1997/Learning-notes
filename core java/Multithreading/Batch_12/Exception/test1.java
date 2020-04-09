
// Checked Exception ..


class test1
{
	public static void main(String args[])	//throws Exception 
	{

	System.out.println("Hello java");

	try
	{
		Thread.sleep(2000);	
	}
	catch(Exception e)
	{
		System.out.println("Error.");
	}

	System.out.println("I am after the 2 sec.");
	}
}
