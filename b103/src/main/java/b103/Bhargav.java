package b103;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bhargav {
	private static final String url="jdbc:mysql://localhost:3306/new_db";
	private static final String username ="root";
	private static final String pass="root";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(url,username,pass);
			System.out.println("Connection established");
			
		try {
			Statement state =con.createStatement();
			String createtbl ="create table one1(id int,name varchar(255))";
			state.execute(createtbl);
			
			
			String instbl="insert into one1 values(1,'sai'),(2,'jh')";
			int num=state.executeUpdate(instbl);
			System.out.println("rows affected " +num);
			
			String is1="update one1 set id =2 where name='jh'";
			int st=state.executeUpdate(is1);
			
			String print ="select *from one1";
			ResultSet rs=state.executeQuery(print);
			
			while(rs.next()) {
			
				int id = rs.getInt("id");
			    String name = rs.getString("name");
			    System.out.print("id="+id);
			    System.out.println(" name="+name);

			
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		} catch (Exception e) {
			e.printStackTrace();
		}

}
}