package ServiceClasss;

import java.sql.Connection;
//package models;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
		public static Connection getConnection()
		{
			Connection connect=null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager.getConnection("jdbc:mysql://soatrucks.cxqzddg0vo8n.us-west-2.rds.amazonaws.com/trucks", "root", "rootroot");
                                
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			return connect;
		}
		
}
