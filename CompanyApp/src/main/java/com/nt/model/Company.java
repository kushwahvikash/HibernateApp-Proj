package com.nt.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
@Entity
public class Company {
	@Id
	private Integer cid;
	private String cname;
	private String addr;
	@ElementCollection
	@CollectionTable(name = "projstab", joinColumns = @JoinColumn(name = "cid"))
	@MapKeyColumn(name = "prj") // index col
	@Column(name = "vers") // element
	Map<String, Double> projs;
	
	//generate Constructor
	public Company() {
		super();
	}

	//generate set/get method
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Map<String, Double> getProjs() {
		return projs;
	}

	public void setProjs(Map<String, Double> projs) {
		this.projs = projs;
	}
	
	//generate toString

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", addr=" + addr + ", projs=" + projs + "]";
	}
	
}
