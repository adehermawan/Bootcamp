package com.mitrais.app;

import java.sql.*;
import java.util.Locale;

public class JdbcOracleCon {
	
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.ENGLISH);
		/*
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stmt = con.createStatement();
			System.out.println(con);

			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  				
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		*/
		
		// using Resultset
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		ResultSet rs=stmt.executeQuery("select * from users");  
		  
		//getting the record of 3rd row  
		rs.absolute(3);  
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		  
		con.close();  
	}

}
