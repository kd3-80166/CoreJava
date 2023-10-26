package com.sunbeam.pojo;

public class Users {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private java.sql.Date dob;
	private boolean status;
	private String role;
	
	public Users() 
	{
	}

	public Users(int id, String fname, String lname, String email, String password, java.sql.Date dob, boolean status,
			String role) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	
	public Users (int id,boolean status) {
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", fname=" + fname + ","
				+ " lname=" + lname + ", email=" + email + ", password="
				+ password + ", dob=" + dob + ", status=" + status + ","
				+ " role=" + role + "]";
	}
	
	
	
	
	
	
}
