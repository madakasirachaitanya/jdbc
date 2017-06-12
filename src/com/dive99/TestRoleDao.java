package com.dive99;

public class TestRoleDao {
	public static void main(String[] args) throws Exception {
		
	
  RoleDao obj = new  RoleDao();
  ModelRole role=new ModelRole();
  role.setId(3);
  role.setName("kazha");
  obj.insertRole(role);
  
}
}
