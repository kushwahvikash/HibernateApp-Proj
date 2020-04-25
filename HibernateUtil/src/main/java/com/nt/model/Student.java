package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer stdId;
	private String stdName;
	private Double stdFee;
	
	
	public Student() {
		super();
	}


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


	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
	
	
	
	

}
