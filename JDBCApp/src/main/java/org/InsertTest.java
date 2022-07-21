package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
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
