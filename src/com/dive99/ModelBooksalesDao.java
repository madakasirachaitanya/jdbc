package com.dive99;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ModelBooksalesDao {
	public void bookSales(ModelBooksales sales) throws Exception{
		Connection connection = ConnectionUtil.getConnectionUtil();
		 String quary4="insert into  book_sales(sales_id,user_id,book_id,qty,total_amount,order_date,status)values(?,?,?,?,?,?,?)";
		PreparedStatement pst3=connection.prepareStatement(quary4);
		pst3.setInt(1,sales.getSales_id());
		 pst3.setInt(2,sales.getUser_id());
		 pst3.setInt(3,sales.getBook_id());
		 pst3.setInt(4, sales.getQty());
		 pst3.setInt(5,sales.getTotal_amount());
		 pst3.setDate(6,Date.valueOf(sales.getOrder_date()));
		 pst3.setString(7,sales.getStatus());
		  int row=pst3.executeUpdate();
		  System.out.println("no of rows="+row);
	}
}
