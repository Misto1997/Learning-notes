
// File Listing Demo ...


import java.io.*;

class File_List
{
	public static void main(String args[])		
	{
		
	File f = new File("Deepak");

	if(f.isDirectory())
	{
		System.out.println("This is a directory");

		String str[] = f.list();

		System.out.println("\nAll the sub files are  :");

		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}	
	else
		System.out.println("not a directory");

	}
}
	