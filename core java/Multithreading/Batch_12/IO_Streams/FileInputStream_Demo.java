
// Read the file ...

import java.io.*;

class FileInputStream_Demo 
{
	public static void main(String args[]) throws Exception 
	{
	FileInputStream fin = new FileInputStream("test");
	int i;
	
	System.out.println("\nRead the file : test");
	while( (i=fin.read()) != -1)
	{
		System.out.print((char)i);
	}
	}
}
