
// Creating Single Thread ...

class first
{
	public static void main(String args[])
	{
		Thread t = new Thread();

		System.out.println(t);

		t.setName("CGC-COE");

		System.out.println("\n\nAfter setting the name");

		System.out.println(t);
	
	}
}
