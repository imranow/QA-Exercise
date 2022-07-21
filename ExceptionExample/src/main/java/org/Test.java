package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
		public static void main(String[] args) {

			String url="jdbc:mysql://localhost:3306/qa-sample";
			String userName="root";
			String password="1234";
			
			
			try {
				Connection con =DriverManager.getConnection(url,userName, password);
				Statement stmt = con.createStatement(); {
				System.out.println("Connection successful");
				String query = "Select * from student";	
				ResultSet rs=stmt.executeQuery(query); //execute the statement and store result
				while(rs.next())  //loop for each "rs" ITERATE THROUGH THE RESULT
				{
					int id=rs.getInt(1); //defining which column to get id from the database
					String name=rs.getString(2);
					String address=rs.getString(3);
					long phone=rs.getLong(4);
					System.out.println(id+"--"+name+"--"+address+"--"+phone);
				}
				rs.close();
				stmt.close();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Something went wrong");
				e.printStackTrace();
			}
			
			
			
		}

	}

	}

