package com.nt.model;



import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@ElementCollection
	@CollectionTable(name="prjstab",joinColumns=@JoinColumn(name="eid"))
	@Column(name="prj")
	private Set<String> prjs;
	
	//generate constructor
	public Employee() {
		super();
	}

	//generate set/get method
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public Set<String> getPrjs() {
		return prjs;
	}

	public void setPrjs(Set<String> prjs) {
		this.prjs = prjs;
	}

	//generate tostring method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", prjs=" + prjs + "]";
	}
	
	
	
	

}
