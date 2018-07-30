package com.model;
import java.sql.*;
public class AuthLogin {
	
	Connection con = null;
	public boolean userExist(String Userid,String Password) throws Exception{
		//String s ="select password from customer where userid=?";
		/*Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "Password123");*/
		con = ConnectionUtil.getConnection();
		Statement st = con.createStatement();
		PreparedStatement pr= con.prepareStatement("select password from customer where userid=? and password=?");
		pr.setString(1,Userid);
		pr.setString(2,Password);
		ResultSet rs= pr.executeQuery();
		while(rs.next()){
			return true;}
		/*ResultSet rs = st.executeQuery(s);
		while(rs.next())
			 System.out.println(rs.getString(1)+"......"+rs.getString(2));
			//System.out.println(se);
			con.close();
			return false;*/
		con.close();
		return false;
		
	}
	

	/*public boolean validate(String uid, String pwd) {
		// TODO Auto-generated method stub
		if (uid.equalsIgnoreCase("sudhamsh") &&
				pwd.equalsIgnoreCase("sud"))
			return true;
		else
			return false;
	}
	*/
	

	

	
	
}
