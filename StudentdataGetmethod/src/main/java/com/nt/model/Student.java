package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stdtab")
public class Student {
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "sfee")
	private Double stdFee;

	// Constructor
	public Student() {
		super();
	}

	// setter/getter method
	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Double getStdFee() {
		return stdFee;
	}

	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}

	// toString method
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}

}
