package com.model;
import java.sql.*;

public class AuthRegister {

	Connection con = null;
	
	public boolean createUser(String userid, String fname, String lname, String email, String pass,
			String bdy, String gender) throws Exception {
		// TODO Auto-generated method stub
		con = ConnectionUtil.getConnection();
		Statement st = con.createStatement();
		PreparedStatement p= con.prepareStatement("insert into customer (userid,First_Name,Last_Name,Email,password,Birthday,Gender) values (?,?,?,?,?,?,?)");
		p.setString(1,userid);
		p.setString(2,fname);
		p.setString(3,lname);
		p.setString(4,email);
		p.setString(5,pass);
		p.setString(6,bdy);
		p.setString(7,gender);
		int r= p.executeUpdate();
		//System.out.println(r);
		con.close();
		if(r>0)
			return true;
		
		else
		return false;
		
		
	}
}
