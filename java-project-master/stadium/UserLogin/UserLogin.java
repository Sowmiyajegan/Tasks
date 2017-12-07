package com.stadium.UserLogin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserLogin")
public class UserLogin {
	private	String username;
	private String password;
	private Integer id;
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserLogin(String username, String password, int id) {
		super();
		this.username = username;
		this.password = password;
		this.id = id;
	}
}
