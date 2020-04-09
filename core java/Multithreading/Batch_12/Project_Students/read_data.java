
/*

Read
write 
update

Steps :
- to access the drives .
- establish the connection b/w database and java
- query
- contain the resulit .
*/

import java.sql.*;

class read_data
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	read_data()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coe","root","password");
	
	ps = con.prepareStatement("select * from login");
			
	rs = ps.executeQuery();

	while(rs.next())
	{
		System.out.println(rs.getString(1));
	}

		}
		catch(Exception e)
		{
		System.out.println(e);
		}

	}
	public static void main(String args[])	
	{
		new read_data();
	}
}

		
	

