package com.middle.domain;

import javax.persistence.Entity;

@Entity
public class User {
	
	private int id;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
