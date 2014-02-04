package com.middle.domain;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Artist {
	
	private int id;
	private Label label;
	private ArrayList<Track> tracks;

	public Artist() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

}
