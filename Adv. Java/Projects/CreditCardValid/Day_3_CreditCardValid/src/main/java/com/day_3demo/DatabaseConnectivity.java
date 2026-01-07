package com.day_3demo;

//Data Persistence layer
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements CardConnectivity {

    @Override
    public boolean isValid(String v1, String v2, String v3, String v4) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/creditcard_demo", "root", "asdf");

            String query = "select * from credit_card_verification where card_no=? and name=? and expiry_date=? and cvv=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, v1);
            pstmt.setString(2, v2);
            pstmt.setString(3, v3);
            pstmt.setString(4, v4);

            ResultSet rs = pstmt.executeQuery();

            return rs.next();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
