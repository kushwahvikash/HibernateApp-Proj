package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PanCard {
	@Id
	@Column(name = "pid")
	private Integer panId;
	@Column(name = "pnum")
	private String panNum;
	@Column(name = "pname")
	private String perName;

}
