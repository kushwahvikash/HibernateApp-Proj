package com.nt.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String hno;
	private String loc;

	public Address() {
		super();
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}

}
