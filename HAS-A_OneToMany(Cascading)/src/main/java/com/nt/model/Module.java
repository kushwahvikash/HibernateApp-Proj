package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modtab")
public class Module {
	@Id
	@Column(name="mid")
	private Integer modId;
	@Column(name="mcode")
	private String modCode;

	public Module() {
		super();
	}

	public Integer getModId() {
		return modId;
	}

	public void setModId(Integer modId) {
		this.modId = modId;
	}

	public String getModCode() {
		return modCode;
	}

	public void setModCode(String modCode) {
		this.modCode = modCode;
	}

	@Override
	public String toString() {
		return "Module [modId=" + modId + ", modCode=" + modCode + "]";
	}

}
