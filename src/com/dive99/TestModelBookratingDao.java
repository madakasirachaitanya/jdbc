package com.dive99;

public class TestModelBookratingDao {
	public static void main(String[] args) throws Exception {
		ModelBookratingDao obj6=new ModelBookratingDao();
		ModelBookrating rate=new ModelBookrating();
		rate.setUser_id(12);
		rate.setBook_id(13);
		rate.setRating(3);
		obj6.insertBookrating(rate);
	}

}
