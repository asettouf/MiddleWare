package com.middle.domain;

import javax.persistence.Entity;

@Entity
public class Track {
	
	private int id;

	public Track() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
