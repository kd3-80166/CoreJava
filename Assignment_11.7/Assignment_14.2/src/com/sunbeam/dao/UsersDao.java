package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sunbeam.dbutil.DbUtil;
import com.sunbeam.pojo.Users;

public class UsersDao implements AutoCloseable{
	private Connection con;
	
	public UsersDao() throws SQLException{
		con = DbUtil.getConnection();
	}
	
	@Override
	public void close() throws Exception {
		try {
			if (con != null) {
				con.close();
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date utilDate = sdf.parse(str);
			return utilDate;
		}
		catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int addUser (Users u) throws SQLException{
		String str = "insert into users values (default,?,?,?,?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(str)){
			stmt.setString(1,u.getFname());
			stmt.setString(2,u.getLname());
			stmt.setString(3,u.getEmail());
			stmt.setString(4,u.getPassword());
			stmt.setDate(5,u.getDob());
			stmt.setBoolean(6,u.isStatus());
			stmt.setString(7,u.getRole());
			int cnt = stmt.executeUpdate();
			return cnt;
		}	
	}
	
	public int deleteUser(int id) throws SQLException {
		String str = "delete from users where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(str)){
			stmt.setInt(1,id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int updateUser (Users u) throws SQLException {
		String str = "update users set status = ?,password = ? where first_name = ? and last_name = ?;";
		try (PreparedStatement stmt = con.prepareStatement(str)){
			stmt.setString(3, u.getFname());
			stmt.setString(4,u.getLname());
			stmt.setBoolean(1, u.isStatus());
			stmt.setString(2,u.getPassword());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public List<Users> displayIdStatus() throws SQLException {
		List<Users> list = new ArrayList<>();
		String str = "select id,status from users";
		try (PreparedStatement stmt = con.prepareStatement(str)){
			try(ResultSet rs = stmt.executeQuery()){
				while (rs.next()) {
					int id = rs.getInt("id");
					boolean s = rs.getBoolean("status");
					Users u = new Users(id,s);
					list.add(u);
				}
			}
		}
		return list;
	}
	
	public int displayVotersCount(int c) throws SQLException {
		int cnt = 0;
		String str = "select count(*) count from users where status=?";
		try (PreparedStatement stmt = con.prepareStatement(str)){
			stmt.setInt(1, c);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				cnt = rs.getInt("count");
			}
			return cnt;
		}
	}

	public List<Users> displayAll() throws SQLException {
		List<Users> list = new ArrayList<>();
		String str = "select * from users";
		try (PreparedStatement stmt = con.prepareStatement(str)){
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				String pass = rs.getString("password");
				java.sql.Date dob = rs.getDate("dob");
				boolean status = rs.getBoolean("status");
				String role = rs.getString("role");
				Users u = new Users(id,fname,lname,email,pass,dob,status,role);
				list.add(u);
			}
			return list;
		}
	}
}
	
	
	
