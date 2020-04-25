package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "emptab")
@PrimaryKeyJoinColumn(name = "eid")
public class Employee extends Person {
	@Column(name = "sal")
	private double empSal;
	@Column(name = "dpt")
	private String empDept;

	public Employee() {
		super();
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empSal=" + empSal + ", empDept=" + empDept + "]";
	}

}
