package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		String user;
		String pwd;
		//Step1: Load the driver
		try {
			Scanner sc=new Scanner(System.in);
			user=sc.nextLine();
			pwd=sc.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			//protocol:subprotocol:DB-specific information
			//jdbc:oracle:
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");
//			String query="insert into users(userid,password) values ('"+user+"','"+pwd+"')";
			String query="insert into users(userid,password) values (?,?)";
//			Statement stmt= con.createStatement();
			PreparedStatement pstmt=con.prepareStatement(query);
//			int updateRowcount= stmt.executeUpdate(query);
			pstmt.setString(1, user);
			pstmt.setString(2, pwd);
			int updateRowCount=pstmt.executeUpdate();
			System.out.println(updateRowCount);
			con.close();
			/*
			 * while(rs.next()) { System.out.println(rs.getString(1) + " "
			 * +rs.getString(2)); }
			 */

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;	}

}
