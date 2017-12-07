package com.stadium.services;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stadium.UserLogin.*;
@Entity
@Table(name="Services")
public class Services extends UserLogin{
	private String parkinglot;
	private String food;
	public Services(String username, String password, int id) {
		super(username, password, id);
	}
	@Column(name="parking_lot")
	public String getParkinglot() {
		return parkinglot;
	}
	public void setParkinglot(String parkinglot) {
		this.parkinglot = parkinglot;
	}
	@Column(name="food")
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	

}
