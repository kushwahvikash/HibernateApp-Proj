package com.nt.model;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class EmpContruct {
	@Temporal(TemporalType.DATE)
	private Date startdate;
	@Temporal(TemporalType.DATE)
	private Date enddate;

	public EmpContruct() {
		super();
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Override
	public String toString() {
		return "EmpContruct [startdate=" + startdate + ", enddate=" + enddate + "]";
	}

}
