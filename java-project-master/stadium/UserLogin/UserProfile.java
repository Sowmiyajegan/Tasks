package com.stadium.UserLogin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="UserLogin")
public class UserProfile extends UserLogin{

	private String email;
	private String address;
	private long phone;
	private String dob; 
	public UserProfile(String username, String password, int id) {
		super(username, password, id);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	@Column(name="phone")
	public long getPhone() {
		return phone;
	}
	@Column(name="dob")
	public String getDob() {
		return dob;
	}
		
}
