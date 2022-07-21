package org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.scanner;


public class methods {
	
	public int method1() {
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
		Connection con=null;
		try {
		 con=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Successful");
		String query="select * from student";// java statement
		Statement stmt=con.createStatement();//SQL statement
		ResultSet rs=stmt.executeQuery(query);//execute the statement and store the query
		while(rs.next()) //iterate through the result
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String address=rs.getString(3);
			long phone=rs.getLong(4);
			System.out.println(id+"--"+name+"--"+address+"--"+phone);
		}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally 
        {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}
		
		public int methods2() {
			String url="jdbc:mysql://localhost:3306/qa-sample";
			String userName="root";
			String password="1234";
			Connection con=null;
			try {
			 con=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Successful");
			String query="insert into student values(101, 'Upasana', 'Bengalore', 999999999)";// java statement
			Statement stmt=con.createStatement();//SQL statement
			stmt.executeUpdate(query);
			System.out.println("one record inserted");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} finally 
	        {
	            try {
	                con.close();
	            } catch (SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
			
		}
		
	}


