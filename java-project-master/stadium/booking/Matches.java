package com.stadium.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Allocation")
public class Matches extends Allocation{
	
	private String mname;
	private int ticketrate;
	private String teams;
	private String timing;
	
	public Matches(String username, String password, int id, String sname) {
		super(username, password, id, sname);
	}
	@Column(name="match_name")
	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
	@Column(name="ticket_rate")
	public int getTicketrate() {
		return ticketrate;
	}

	public void setTicketrate(int ticketrate) {
		this.ticketrate = ticketrate;
	}
	@Column(name="teams")
	public String getTeams() {
		return teams;
	}

	public void setTeams(String teams) {
		this.teams = teams;
	}
	@Column(name="timing")
	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}
}
