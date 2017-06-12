package com.dive99;

import java.time.LocalDate;

public class TestModelBooksales {
public static void main(String[] args) throws Exception {
	 ModelBooksalesDao obj4= new ModelBooksalesDao();
	 ModelBooksales sales=new ModelBooksales();
	 sales.setSales_id(3455);
	 sales.setUser_id(154);
	sales.setBook_id(44);
	 sales.setQty(4445);
	sales.setTotal_amount(2003);
	sales.setOrder_date(LocalDate.parse("2015-04-22"));
	sales.setStatus("deviver");
	obj4.bookSales(sales);
}
}
