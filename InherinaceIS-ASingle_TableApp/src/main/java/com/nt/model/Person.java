package com.nt.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "CommonTab")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "info", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("PER")
public class Person {
	@Id
	@Column(name = "pid")
	private Integer perId;
	@Column(name = "pname")
	private String perName;

	public Person() {
		super();
	} 

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + "]";
	}

}
