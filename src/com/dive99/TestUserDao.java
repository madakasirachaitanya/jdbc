package com.dive99;

import java.sql.SQLException;

public class TestUserDao {

	public static void main(String[] args) throws Exception {
		
		ModelUser model=new ModelUser();
		UserDao userdao=new UserDao();
		model.setId(5);
		model.setUsername("kiran");
		model.setPassward("kiru");
		model.setEmailid("chaitu@gmail.com");
		model.setActive("i");
		try{
        userdao.insert(model);
		}catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
