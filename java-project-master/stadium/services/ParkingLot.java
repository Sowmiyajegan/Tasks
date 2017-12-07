package com.stadium.services;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Parkinglot")
public class ParkingLot {

	private String plotno;
	private int duration;
	private int charges;
	@Column(name="plot_no")
	public String getPlotno() {
		return plotno;
	}
	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
	@Column(name="duration")
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Column(name="charges")
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	
}
