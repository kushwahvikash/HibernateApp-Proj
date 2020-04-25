package com.nit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="custtab")
public class Customer {
@Id
@Column(name="cid")
	private Integer custId;
@Column(name="cname")
	private String custName;
@Column(name="caddr")
	private String custAddrs;
	
	//Generate constructor for customer
	public Customer() {
		super();
	}

//generate set/get method for customer
	public Integer getCustId() {
		return custId;
	}


	public void setCustId(Integer custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustAddrs() {
		return custAddrs;
	}


	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}

//Generate  toString method for customer
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddrs=" + custAddrs + "]";
	}
	
 
}
