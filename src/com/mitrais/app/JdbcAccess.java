package com.mitrais.app;

import java.sql.*;

public class JdbcAccess {
	public static void main(String ar[]){  
		 try{  
		   String database="student.mdb";//Here database exists in the current directory  
		  
		   String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)}";
		                    //DBQ=" + database + ";DriverID=22;READONLY=true";
		   
		  
		   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
		   Connection c=DriverManager.getConnection(url);  
		   Statement st=c.createStatement();  
		   ResultSet rs=st.executeQuery("select * from login");  
		    
		   while(rs.next()){  
		    System.out.println(rs.getString(1));  
		   }  
		  
		}catch(Exception ee){System.out.println(ee);}  
		  
		}
}
