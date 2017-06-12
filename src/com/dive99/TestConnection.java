package com.dive99;

import java.sql.Connection;

public class TestConnection {
          public static void main(String[] args) throws Exception {
        	  Connection connection=ConnectionUtil.getConnectionUtil();
			System.out.println(connection);
		}
}
