package com.swjd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/communitydb?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false&&allowPublicKeyRetrieval=true","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(ResultSet rs,PreparedStatement ps,Connection conn) {
		try {
			if (rs!=null) {
				rs.close();
			}
			if (ps!=null) {
				ps.close();
			}
			if (conn!=null) {
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		System.out.println(getConn());
	}
}

