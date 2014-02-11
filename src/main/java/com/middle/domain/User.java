package com.middle.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
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
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@OneToMany(targetEntity=Playlist.class, cascade=CascadeType.ALL)
	private Collection<Playlist> playlist;
	

	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(String password, String email) {
		super();
		this.password = password;
		this.email = email;
		this.playlist=new ArrayList<Playlist>();
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	public Collection<Playlist> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Collection<Playlist> playlist) {
		this.playlist = playlist;
	}

}
