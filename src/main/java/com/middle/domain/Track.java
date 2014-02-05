package com.middle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Track {
	
	private int trackId;
	private Release release;
	private Style style;
	private String name;

	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Track(Release release, Style style, String name) {
		super();
		this.release = release;
		this.style = style;
		this.name = name;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int id) {
		this.trackId = id;
	}

	@OneToOne
	@JoinColumn(name="styleId")
	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	@OneToOne
	@JoinColumn(name="releaseId")
	public Release getRelease() {
		return release;
	}

	public void setRelease(Release release) {
		this.release = release;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
