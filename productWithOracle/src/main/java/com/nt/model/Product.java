package com.nt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "prodtab")
public class Product {
	@Id
	@Column(name = "pid")
	private Integer ProdId;
	@Column(name = "pcode")
	private String prodCode;
	@Temporal(TemporalType.DATE)
	private Date mfgDate;
	@Temporal(TemporalType.TIME)
	private Date expDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date testSlot;

	// generate Constructor
	public Product() {
		super();
	}

	// generate Set /Get method

	public Integer getProdId() {
		return ProdId;
	}

	public void setProdId(Integer prodId) {
		ProdId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getTestSlot() {
		return testSlot;
	}

	public void setTestSlot(Date testSlot) {
		this.testSlot = testSlot;
	}

	// generate toString method
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", prodCode=" + prodCode + ", mfgDate=" + mfgDate + ", expDate=" + expDate
				+ ", testSlot=" + testSlot + "]";
	}

}
