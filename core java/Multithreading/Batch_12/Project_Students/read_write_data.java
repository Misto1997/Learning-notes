
// Reading 7 writing data into window mode ...

import java.sql.*;

import javax.swing.*;
import java.awt.event.*;

class read_write_data extends JFrame implements ActionListener
{
	JLabel l;
	JTextField t;
	JButton b1,b2;

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	read_write_data()
	{
		super("Testing the database into window mode.");
		l = new JLabel("Enter the Username : ");
		t = new JTextField(10);

		b1 = new JButton("Login");
		b2 = new JButton("Write");

		add(l);
		add(t);
		add(b1);
		add(b2);

		setLayout(null);

		l.setBounds(40,40,140,20);
		t.setBounds(190,40,100,20);
		b1.setBounds(50,180,80,20);
		b2.setBounds(160,180,80,20);

		b1.addActionListener(this);
		b2.addActionListener(this);

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coe","root","password");
		}
		catch(Exception e)
		{
		}

		setLocation(100,100);
		setSize(450,350);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//System.out.println("Button Click Now.");
		Object o = ae.getSource();
		
		if(o==b1)
		{
		System.out.println("You Press Login");

		try
		{
		ps=con.prepareStatement("select * from login where uname=?");
		ps.setString(1,t.getText());
		rs=ps.executeQuery();

		if(rs.next())
JOptionPane.showMessageDialog(this,"Valid User","Congrats",JOptionPane.INFORMATION_MESSAGE);
		
		else
JOptionPane.showMessageDialog(this,"Invalid User","Congrats",JOptionPane.INFORMATION_MESSAGE);

		}
		catch(Exception e)
		{
		}
			


		
		}
		if(o==b2)
		{

		try
		{
		ps=con.prepareStatement("insert into login values(?,?)");
		ps.setString(1,t.getText());
		ps.setString(2,t.getText());
		
		ps.executeUpdate();
		
JOptionPane.showMessageDialog(this,"Values Inserted ","OK",JOptionPane.INFORMATION_MESSAGE);
		
		}
		
		catch(Exception e)
		{
		
		}

		}
	}
	public static void main(String arg[])
	{
		new read_write_data();
	}
}

			
		