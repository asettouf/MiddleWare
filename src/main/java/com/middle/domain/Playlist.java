package com.middle.domain;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Playlist {

	private int playlistId;
	private ArrayList<Track> songs;
	private String name;

	public Playlist() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int id) {
		this.playlistId = id;
	}

	@OneToMany
	@JoinColumn(name="trackId")
	public ArrayList<Track> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Track> songs) {
		this.songs = songs;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
