package com.middle.client;

import java.util.Collection;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.middle.domain.Artist;
import com.middle.domain.Label;
import com.middle.domain.Playlist;
import com.middle.domain.Release;
import com.middle.domain.Style;
import com.middle.domain.Track;
import com.middle.domain.User;

public class ClientMid implements KioskAPITester<Artist, Release, User, Style, Playlist, Label, Track> {

	//private final String baseUri="http://localhost/middleware/";
	
	private Client client;
	
	private WebTarget base;
	
	public ClientMid() {
		client=ClientBuilder.newClient();
		//base=client.target("http://localhost/middleware/");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void authenticate(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Release> getLatestReleases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Release getRelease(int id_release) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Release> getSimilarReleases(int id_release) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addReleaseToFavorities(int id_release) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeReleaseToFavorities(int id_release) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Artist> getLatestArtists() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artist getArtist(int id_artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Release> getReleasesFromArtist(int id_artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Label> getLatestLabels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Label getLabel(int id_label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Artist> getArtistsFromLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Style> getAllStyles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Style getStyle(int id_style) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inviteUser(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptInvitation(String token, String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<User> getAllUsers() {
		// TODO Auto-generated method stub
		Collection<User> tt=client.target("http://localhost/middleware").path("users").request(MediaType.APPLICATION_XML)
				.get(new GenericType<Collection<User>>() {});
		return tt;
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(int id_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void askResetPassword(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPassword(String token, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Playlist> getCurrentPlaylists() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createPlaylist() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Playlist getPlaylist(int id_playlist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePlaylist(int id_playlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTrackToPlaylist(int id_playlist, Track track) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrackFromPlaylist(int id_playlist, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Release> getFavorities() {
		// TODO Auto-generated method stub
		return null;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
