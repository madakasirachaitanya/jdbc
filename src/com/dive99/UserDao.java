package com.dive99;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class UserDao {
	
	 
	 public void insert(ModelUser model)throws Exception
	 
	 {
		 Connection connection=ConnectionUtil.getConnectionUtil();
		 String Query="insert into user (id ,username,passward,emailid,active) values(?,?,?,?,?)";
		
	
		 PreparedStatement pst = connection.prepareStatement(Query);
			pst.setInt(1,model.getId());
			 pst.setString(2, model.getUsername());
			 pst.setString(3,model.getPassward());
			 pst.setString(4, model.getEmailid());
			 pst.setString(5,model.getActive());
		
			 int rows = pst.executeUpdate();
		     System.out.println("No of rows updated: " + rows);
		 
			// System.out.println("insert user values");
	 }
}
