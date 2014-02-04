package com.middle.domain;

import javax.persistence.Entity;

@Entity
public class Label {
	private int id;

	public Label() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
