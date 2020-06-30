package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Tt {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Scanner sc = new Scanner(System.in);
		int prod_code= sc.nextInt();
		
		System.out.println("enter the product code");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product" ,"root" ,"root");
		
		PreparedStatement pst = con.prepareStatement("update product set add prod_id where prod_code=?");
		pst.setFloat(1, prod_code);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println("rs");
		}
		
		
		
		
	}
        }


