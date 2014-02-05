package com.middle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Style {

	private int styleId;
	private String style;
	
	public Style() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Style(String style) {
		super();
		this.style = style;
	}



	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getStyleId() {
		return styleId;
	}

	public void setStyleId(int id) {
		this.styleId = id;
	}
	
	@Column(name = "style")
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
