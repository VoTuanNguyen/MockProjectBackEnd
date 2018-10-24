package com.fpt.project.model;

import java.util.Date;

public class JwtUser {
	private String userName;
	private long id;
	private String role;
	private Date date;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
