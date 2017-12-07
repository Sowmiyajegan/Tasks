package com.stadium.billing;
import com.stadium.services.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.stadium.booking.*;
@Entity
@Table(name="Bill")
public class Bill {
	private Integer food;
	private Integer parking;
	private Integer ticket;
	private Integer total;
	@Column(name="total")
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Column(name="food")
	public Integer getFood() {
		return food;
	}
	public void setFood(Integer food) {
		this.food = food;
	}
	@Column(name="parking")
	public Integer getParking() {
		return parking;
	}
	public void setParking(Integer parking) {
		this.parking = parking;
	}
	@Column(name="ticket")
	public Integer getTicket() {
		return ticket;
	}
	public void setTicket(Integer ticket) {
		this.ticket = ticket;
	}
	
	
}
