package com.mitrais.app;

import java.sql.*;

public class JdbcPrepared {
public static void main(String[] args) {
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/jdbc","root","");  
		  
		/*
		 // Insert Data
		PreparedStatement stmt=con.prepareStatement("insert into users values(?,?,?,?)");  
		stmt.setInt(1,3);//1 specifies the first parameter in the query  
		stmt.setString(2,"Andi");
		stmt.setString(3,"Andi");
		stmt.setString(4,"Andi@google.com");
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  */
		
		// For Update data
		/*
		PreparedStatement stmt=con.prepareStatement("update users set username=? where id=?");  
		stmt.setString(1,"Hermawan");//1 specifies the first parameter in the query i.e. name  
		stmt.setInt(2,2);  

		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  
		*/
		// Delete Data
		/*
		PreparedStatement stmt=con.prepareStatement("delete from users where id=?");  
		stmt.setInt(1,3);  
		  h
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");  
		*/
		
		// Retrive Data
		PreparedStatement stmt=con.prepareStatement("select * from users");  
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
		System.out.println(rs.getInt(1)+" "+rs.getString(2));  
		}  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
}

