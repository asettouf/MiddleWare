package com.middle.domain;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String password;
	private String email;
	private ArrayList<Playlist> playlist;
	

	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}
	 @Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany
	
	public ArrayList<Playlist> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<Playlist> playlist) {
		this.playlist = playlist;
	}

}
