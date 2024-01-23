package sai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/new_db";
		String username="root";
		String pass="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
			
			Connection con=DriverManager.getConnection(url,username,pass);
			Statement st=  con.createStatement();
			System.out.println("connection established");
			String query = "select *from people";
			ResultSet rst = st.executeQuery(query);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
