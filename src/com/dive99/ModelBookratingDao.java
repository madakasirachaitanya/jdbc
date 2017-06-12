package com.dive99;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ModelBookratingDao {
public void insertBookrating(ModelBookrating rate) throws Exception{
	Connection connection = ConnectionUtil.getConnectionUtil();
	String quary5="insert into book_rating(user_id,book_id,rating)values(?,?,?)";
	PreparedStatement pst4=connection.prepareStatement(quary5);
	pst4.setInt(1,rate.getUser_id());
	 pst4.setInt(2,rate.getBook_id());
	 pst4.setInt(3,rate.getRating());
	 int row=pst4.executeUpdate();
	  System.out.println("no of rows="+row);
}
}
