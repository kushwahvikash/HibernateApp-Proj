package com.nt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="prjtab")
public class Project {
	@Id
	@Column(name="pid")
	private Integer prjId;
	@Column(name="pname")
	private String prjName;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pidfk")
	private List<Module> mobs;

	public Project() {
		super();
	}

	public Integer getPrjId() {
		return prjId;
	}

	public void setPrjId(Integer prjId) {
		this.prjId = prjId;
	}

	public String getPrjName() {
		return prjName;
	}

	public void setPrjName(String prjName) {
		this.prjName = prjName;
	}

	public List<Module> getMobs() {
		return mobs;
	}

	public void setMobs(List<Module> mobs) {
		this.mobs = mobs;
	}

	@Override
	public String toString() {
		return "Project [prjId=" + prjId + ", prjName=" + prjName + ", obs=" + mobs + "]";
	}

}
