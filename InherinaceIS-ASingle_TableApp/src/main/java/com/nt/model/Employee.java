package com.nt.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EMP")
public class Employee extends Person {

	@Column(name = "esal")
	private double empSal;
	@Column(name = "edpt")
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
