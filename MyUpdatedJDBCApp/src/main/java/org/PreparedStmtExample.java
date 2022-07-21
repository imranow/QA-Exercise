package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStmtExample {
	public static void main(String[] args) {

	String url="jdbc:mysql://localhost:3306/qa-sample";
	String userName="root";
	String password="1234";
	Connection con=null;
	
	try {
		con=DriverManager.getConnection(url,userName, password);
		System.out.println("Connection successful");
		
		//read, update, delete operations occur here in the try block
		PreparedStatement pstmt =con.prepareStatement("select * from student where id=? or name=? or address=?");
		pstmt.setInt(1, 107);
		pstmt.setString(2, "Upasana");
		pstmt.setString(3, "London");
		
		ResultSet rs=stmt.executeQuery(); //execute the statement and store result
		while(rs.next())  //loop for each "rs" ITERATE THROUGH THE RESULT
		{
			int id=rs.getInt(1); //defining which column to get id from the database
			String name=rs.getString(2);
			String address=rs.getString(3);
			long phone=rs.getLong(4);
			System.out.println(id+"--"+name+"--"+address+"--"+phone);
		}
		
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		System.out.println("Something went wrong");
		e.printStackTrace();
	}finally //used to close the connection to the database
	{
		try {
			con.close(); // connection closed.
			System.out.println("Database connection closed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	
	
}

}
