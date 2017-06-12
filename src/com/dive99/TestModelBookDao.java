package com.dive99;

import java.time.LocalDate;

public class TestModelBookDao {
public static void main(String[] args) throws Exception {
	ModelBookDao obj2= new ModelBookDao();
	ModelBook book =new ModelBook();
	book.setIsbn(4);
	book.setTitle("amaravati");
	book.setAuthor("shvraj");
	book.setPublisherDate(LocalDate.parse("2012-12-03"));
	book.setContent("shvraj tells about the captial of andhra ptradesh");
	book.setPrice(300);
	book.setStatus("excellent");
	
	obj2.insertBook(book);
	
}
}
