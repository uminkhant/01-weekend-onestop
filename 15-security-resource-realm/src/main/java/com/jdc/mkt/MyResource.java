package com.jdc.mkt;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.jdc.mkt.User.Role;

import jakarta.annotation.Resource;
import jakarta.annotation.sql.DataSourceDefinition;

public class MyResource {

	//@Resource(name = "jdbc/testdb")
	//private DataSource ds;
	
	public static Connection getConnection() throws NamingException, SQLException {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/testdb");
		return ds.getConnection();
	}
	
	public static  List<User> getUsers() {
		
		String sql ="select * from user_tbl ";
		List<User> list = new ArrayList<>();
		
		try(var con = getConnection();
				var stmt = con.prepareStatement(sql)){
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				User u = new User(rs.getString("loginId"),
						rs.getString("password"), 
						Role.valueOf(rs.getString("role")));
				list.add(u);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
}
