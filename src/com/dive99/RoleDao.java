package com.dive99;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RoleDao {
   public void insertRole(ModelRole role) throws Exception
   {
	   Connection connection = ConnectionUtil.getConnectionUtil();
	   String  Queary1="insert into role(id,name) values(?,?)";
	   PreparedStatement pst=connection.prepareStatement(Queary1);
	   pst.setInt(1,role.getId());
	   pst.setString(2,role.getName());
	   int row=pst.executeUpdate();
	   System.out.println("no of rows ="+row);
	   
	   
	   
	   
   }
}
