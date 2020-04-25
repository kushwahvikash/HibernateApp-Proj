package com.nt.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "smarktab")
public class StudentInfo1 {
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "sfee")
	private Double stdFee;
	@ElementCollection
	@CollectionTable(name = "stdmrks", joinColumns = @JoinColumn(name = "sid"))
	@Column(name = "mrks")
	private List<Double> marks;

	// generate constructor
	public StudentInfo1() {
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

	public List<Double> getMarks() {
		return marks;
	}

	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentInfo [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + ", marks=" + marks + "]";
	}

}
