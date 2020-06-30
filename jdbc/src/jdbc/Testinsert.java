package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Testinsert {

	public static void main(String[] args) {
		ArrayList<Insertp> app = new ArrayList<Insertp>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root" ,"root");
				Statement st = conn.createStatement();
				String sql = " insert into product"+"(prod_code,prod_name,prod_price,prod_catg) values"+ "(?,?,?,?);";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setFloat(1,  100093);
				pst.setString(2, "mobile");
				pst.setFloat(3,  20000);
				pst.setString(4, "laptop");
				System.out.println(pst);
				pst.executeUpdate();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	

	}

}
