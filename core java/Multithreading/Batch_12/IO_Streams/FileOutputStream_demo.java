


//  wrire the data into file ...


import java.io.*;
import java.util.*;

class FileOutputStream_demo
{
	public static void main(String args[]) throws Exception 
	{

	FileOutputStream fout = new FileOutputStream("Hitesh");
	Scanner s = new Scanner(System.in);

	System.out.println("\n\nEnter the data : ");
	String str = s.nextLine();

	byte b[] = str.getBytes();
	fout.write(b);
	System.out.println("\nData written ...");
	}
}

	