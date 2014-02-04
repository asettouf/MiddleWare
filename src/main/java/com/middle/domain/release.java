package com.middle.domain;

import javax.persistence.Entity;

@Entity
public class release {
	
	private int id;

	public release() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
