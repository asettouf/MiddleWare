package com.middle.domain;

import javax.persistence.Entity;

@Entity
public class Artist {
	
	private int id;

	public Artist() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
