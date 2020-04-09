
// File Class Inbuilt methods implementation...

import java.io.File;
class File_Demo 
{
	public static void main(String args[])
	{
		File f = new File("new");
		File f1 = new File("test");

		System.out.println("Exist : "+f.exists());
		System.out.println("Name : "+f.getName());
		System.out.println("Path : "+f.getPath());
		System.out.println("Abs Path : "+f.getAbsolutePath());

		if(f.isFile())
		System.out.println("This is a File.");
		else
		System.out.println("Not a file ");

		if(f.canRead())
		System.out.println("You Can read");
		else
		System.out.println("You can't read");
		System.out.println("File renamed : "+f.renameTo(f1));

		if(f.isDirectory())
		System.out.println("is a directory");
		else
		System.out.println("Not a directory");
		
		
	
	}
}


