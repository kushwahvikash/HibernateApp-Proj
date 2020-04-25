package com.nt.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empcontab")
public class Employee {
	@Id
	private Integer eid;
	private String ename;
	@Embedded
	private EmpContruct ec;

	
	public Employee() {
		super();
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public EmpContruct getEc() {
		return ec;
	}


	public void setEc(EmpContruct ec) {
		this.ec = ec;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	

}