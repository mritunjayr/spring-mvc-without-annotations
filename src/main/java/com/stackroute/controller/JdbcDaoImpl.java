package com.stackroute.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDaoImpl {


    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sys", "mritunjay", "Admin@123");


            //here sonoo is database name, root is username and password


            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) );
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
