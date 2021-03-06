package com.fpt.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name", columnDefinition = "nvarchar(50)")
	private String name;
	@Column(name = "email", unique = true, columnDefinition = "varchar(50)")
	private String email;
	@Column(name = "userName", unique = true, columnDefinition = "varchar(50)")
	private String userName;
	@Column(name = "password", columnDefinition = "text")
	private String password;
	@Column(name = "phone", columnDefinition = "text")
	private String phone;
	@Column(name = "address", columnDefinition = "text")
	private String address;
	@Column(name = "role")
	private int role;

	public User() {
		super();
	}

	public User(int id, String name, String email, String userName, String password, String phone, String address,
			int role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}

	public User(String name, String email, String userName, String password, String phone, String address, int role) {
		super();
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}

	public User(String userName, int role) {
		super();
		this.userName = userName;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", userName=" + userName + ", password="
				+ password + ", phone=" + phone + ", address=" + address + ", role=" + role + "]";
	}

}
