package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "stdtab")
@PrimaryKeyJoinColumn(name = "eid")
public class Student extends Person {
	@Column(name = "sfee")
	private double stdFee;
	@Column(name = "grd")
	private String stdGrd;

	public Student() {
		super();
	}

	public double getStdFee() {
		return stdFee;
	}

	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}

	public String getStdGrd() {
		return stdGrd;
	}

	public void setStdGrd(String stdGrd) {
		this.stdGrd = stdGrd;
	}

	@Override
	public String toString() {
		return "Student [stdFee=" + stdFee + ", stdGrd=" + stdGrd + "]";
	}

}
