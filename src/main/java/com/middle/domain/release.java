package com.middle.domain;

import javax.persistence.Entity;

@Entity
public class Release {
	
	private int id;

	public Release() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
