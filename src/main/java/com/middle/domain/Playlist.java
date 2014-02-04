package com.middle.domain;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Playlist {

	private int id;
	private ArrayList<Track> songs;

	public Playlist() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Track> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Track> songs) {
		this.songs = songs;
	}
}
