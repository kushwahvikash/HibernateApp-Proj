package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "crstab")
public class Course {
	@Id
	@Column(name = "cid")
	private Integer crsId;
	@Column(name = "ccode")
	private String crsCode;
	@Column(name = "cfee")
	private Double crsFee;

}
