package com.stadium.booking;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.stadium.UserLogin.*;
@Entity
@Table(name="Allocaation")
public class Allocation extends UserLogin{
	
	private String sname;
	private String saddress;
	private int noofseats;
	private int seatsbooked;
	private String allotedseats;
	
	public Allocation(String username, String password, int id, String sname) {
		super(username, password, id);
		this.sname = sname;
	}

	@Id
	@Column(name="stadium_name")
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	@Column(name="stadium_address")
	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Column(name="no_of_seats")
	public int getNoofseats() {
		return noofseats;
	}

	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	@Column(name="seats_booked")
	public int getSeatsbooked() {
		return seatsbooked;
	}

	public void setSeatsbooked(int seatsbooked) {
		this.seatsbooked = seatsbooked;
	}
	@Column(name="alloted_seats")
	public String getAllotedseats() {
		return allotedseats;
	}

	public void setAllotedseats(String allotedseats) {
		this.allotedseats = allotedseats;
	}
	
	
	
}
