package com.nt.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "stdtab1")
public class Student1 {
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Lob
	@Column(name = "simg")
	private byte[] stdImg;
	@Lob
	@Column(name = "resume")
	private char[] stdResTxt;

	// generate constructor
	public Student1() {
		super();
	}

	// generate set/get method

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

	public byte[] getStdImg() {
		return stdImg;
	}

	public void setStdImg(byte[] stdImg) {
		this.stdImg = stdImg;
	}

	public char[] getStdResTxt() {
		return stdResTxt;
	}

	public void setStdResTxt(char[] stdResTxt) {
		this.stdResTxt = stdResTxt;
	}

	// generate toString method
	@Override
	public String toString() {
		return "student [stdId=" + stdId + ", stdName=" + stdName + ", stdImg=" + Arrays.toString(stdImg)
				+ ", stdResTxt=" + Arrays.toString(stdResTxt) + "]";
	}
}
