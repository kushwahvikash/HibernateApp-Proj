package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Qtab")
public class Quote {
	@Id
	@Column(name="qid")
	private Integer qteId;
	@Column(name="qamt")
	private double qteMinAmt;
	@Column(name="qcode")
	private String qteCode;
	
	
	public Quote() {
		super();
	}
	public Integer getQteId() {
		return qteId;
	}
	public void setQteId(Integer qteId) {
		this.qteId = qteId;
	}
	public double getQteMinAmt() {
		return qteMinAmt;
	}
	public void setQteMinAmt(double qteMinAmt) {
		this.qteMinAmt = qteMinAmt;
	}
	public String getQteCode() {
		return qteCode;
	}
	public void setQteCode(String qteCode) {
		this.qteCode = qteCode;
	}
	@Override
	public String toString() {
		return "Quote [qteId=" + qteId + ", qteMinAmt=" + qteMinAmt + ", qteCode=" + qteCode + "]";
	}
	

}
