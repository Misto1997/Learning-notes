// write the data into tables ...


import java.sql.*;

class write_data
{
	Connection con;
	PreparedStatement ps;
	
	write_data(String u,String p)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coe","root","password");
	
ps = con.prepareStatement("insert into login values(?,?)");
		ps.setString(1,u);
		ps.setString(2,p);

		ps.executeUpdate();	
		
		System.out.println("\nInserted data ...");
		
			
	

		}
		catch(Exception e)
		{
		System.out.println(e);
		}

	}
	public static void main(String args[])	
	{
		new write_data("amit","123");
	}
}