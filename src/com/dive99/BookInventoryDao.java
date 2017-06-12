package com.dive99;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookInventoryDao {

	  public void bookInventory(ModelBookinventory inventry) throws Exception{
		 Connection connection = ConnectionUtil.getConnectionUtil();
		 String quary3="insert into book_inventory(id ,  qty )values(?,?)";
		 PreparedStatement pst=connection.prepareStatement(quary3);
		 pst.setInt(1,inventry.getId());
		 pst.setInt(2,inventry.getQty());
		 
	  }
}
