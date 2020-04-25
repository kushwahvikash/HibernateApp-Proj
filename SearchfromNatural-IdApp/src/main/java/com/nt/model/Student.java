package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

import lombok.Data;
@Data
@Entity
@Table(name="sttab2")
@DynamicInsert
@DynamicUpdate
public class Student {
	@Id
	private Integer stdId;
	@NaturalId
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
