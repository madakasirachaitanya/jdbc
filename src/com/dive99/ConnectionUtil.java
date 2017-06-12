package com.dive99;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	 public static Connection getConnectionUtil() throws Exception{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url = "jdbc:mysql://localhost:3306/madakarira?useSSL=false";
		 Connection con = DriverManager.getConnection(url,"root","chaitu");
		 return con;
	 }

}
