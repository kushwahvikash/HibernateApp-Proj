package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contab")
public class Contract {
	@Id
	@Column(name="cid")
	private Integer conId;
	@Column(name="ven")
	private String  vendor;
	@Column(name="rcode")
	private String regCode;
	@ManyToOne
	@JoinColumn(name="qidfk")
	private Quote qob;
		public Contract() {
		super();
	}
		public Integer getConId() {
			return conId;
		}
		public void setConId(Integer conId) {
			this.conId = conId;
		}
		public String getVendor() {
			return vendor;
		}
		public void setVendor(String vendor) {
			this.vendor = vendor;
		}
		public String getRegCode() {
			return regCode;
		}
		public void setRegCode(String regCode) {
			this.regCode = regCode;
		}
		public Quote getQob() {
			return qob;
		}
		public void setQob(Quote qob) {
			this.qob = qob;
		}
		@Override
		public String toString() {
			return "Contract [conId=" + conId + ", vendor=" + vendor + ", regCode=" + regCode + ", qob=" + qob + "]";
		}
		
}