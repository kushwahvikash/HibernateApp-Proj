package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mailtab")
public class E_mail {

	@Id
	@Column(name = "mid")
	private Integer mailId;

	@Column(name = "t")
	private String t;

	@Column(name = "frm")
	private String from;

	@Column(name = "sub")
	private String subject;

	@Column(name = "txt")
	private String text;

//generate constructor
	public E_mail() {
		super();
	}

//generate  set/get method

	public Integer getMailId() {
		return mailId;
	}

	public void setMailId(Integer mailId) {
		this.mailId = mailId;
	}

	public String getTo() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getForm() {
		return from;
	}

	public void setForm(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

// generate toString method

	@Override
	public String toString() {
		return "E_mail [mailId=" + mailId + ", to=" + t + ", from=" + from + ", subject=" + subject + ", text=" + text
				+ "]";
	}

}
