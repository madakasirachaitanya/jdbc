package com.dive99;

public class TestBookinventoryDao {
public static void main(String[] args) throws Exception {
	BookInventoryDao obj3= new BookInventoryDao();
	ModelBookinventory inventry =new ModelBookinventory();
	inventry.setId(3);
	inventry.setQty(4);
    obj3.bookInventory(inventry);
}
}
