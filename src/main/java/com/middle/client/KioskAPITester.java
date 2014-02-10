package com.middle.client;

import java.util.Collection;

/**
 * Allow to test the Kiosk API
 * 
 * @param <Artist>
 * @param <Release>
 * @param <User>
 * @param <Style>
 * @param <Playlist>
 * @param <Label>
 * @param <Track>
 */
public interface KioskAPITester<Artist, Release, User, Style, Playlist, Label, Track>{

	/* Sessions methods */

	/**
	 * Authenticate an user
	 * 
	 * @param email
	 * @param password
	 */
	public void authenticate(String email, String password);

	/* Releases methods */

	/**
	 * List the latest 50 releases
	 * 
	 * @return a collection with the releases
	 */
	public Collection<Release> getLatestReleases();

	/**
	 * Return the specified release
	 * 
	 * @param id_release
	 * @return the release
	 */
	public Release getRelease(int id_release);

	/**
	 * Return similar releases of the one specified
	 * 
	 * @param id_release
	 * @return a collection with the releases
	 */
	public Collection<Release> getSimilarReleases(int id_release);

	/**
	 * Add the release to the current user favorites
	 * 
	 * @param id_release
	 */
	public void addReleaseToFavorities(int id_release);

	/**
	 * Remove the release from the current user favorites
	 * 
	 * @param id_release
	 */
	public void removeReleaseToFavorities(int id_release);

	/* Artists methods */

	/**
	 * List the latest 50 artists
	 * 
	 * @return a collection with the artists
	 */
	public Collection<Artist> getLatestArtists();

	/**
	 * Return the specified artist
	 * 
	 * @param id_artist
	 * @return the artist
	 */
	public Artist getArtist(int id_artist);

	/**
	 * List the specified artist releases
	 * 
	 * @param id_artist
	 * @return a collection with the releases
	 */
	public Collection<Release> getReleasesFromArtist(int id_artist);

	/* Labels methods */

	/**
	 * List the latest 50 labels
	 * 
	 * @return a collection with the labels
	 */
	public Collection<Label> getLatestLabels();

	/**
	 * Return the specified label
	 * 
	 * @param id_label
	 * @return the label
	 */
	public Label getLabel(int id_label);

	/**
	 * List the specified label artists
	 * 
	 * @return a collection with the artists
	 */
	public Collection<Artist> getArtistsFromLabel();

	/* Styles methods */

	/**
	 * List all available styles
	 * 
	 * @return a collection with the styles
	 */
	public Collection<Style> getAllStyles();

	/**
	 * Show details about the specified style
	 * 
	 * @param id_style
	 * @return the style
	 */
	public Style getStyle(int id_style);

	/* Users methods */

	/**
	 * Invite a user
	 * 
	 * @param email
	 */
	public void inviteUser(String email);

	/**
	 * Accept an invitation that was received by email by a user
	 * 
	 * @param token
	 * @param email
	 * @param password
	 */
	public void acceptInvitation(String token, String email, String password);

	/**
	 * List all users
	 * 
	 * @return a collection with the users
	 */
	public Collection<User> getAllUsers();

	/**
	 * Create a user
	 * 
	 * @param user
	 */
	public void createUser(User user);

	/**
	 * Return the specified user
	 * 
	 * @param id_user
	 * @return the user
	 */
	public User getUser(int id_user);

	/**
	 * Update the specified user
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * Delete a user account
	 * 
	 * @param id
	 */
	public void deleteUser(int id);

	/**
	 * Send by email reset password instructions
	 * 
	 * @param id
	 */
	public void askResetPassword(int id);

	/**
	 * Reset a password
	 * 
	 * @param token
	 * @param password
	 */
	public void resetPassword(String token, String password);

	/* Playlists methods */

	/**
	 * Get the current user playlists
	 * 
	 * @return a collection with the playlists
	 */
	public Collection<Playlist> getCurrentPlaylists();

	/**
	 * Create an empty playlist
	 * 
	 * @return the playlist
	 */
	public int createPlaylist();

	/**
	 * Show a playlist.
	 * 
	 * @param id_playlist
	 * @return the playlist
	 */
	public Playlist getPlaylist(int id_playlist);

	/**
	 * Delete the specified playlist.
	 * 
	 * @param id_playlist
	 */
	public void deletePlaylist(int id_playlist);

	/**
	 * Add a track to a playlist
	 * 
	 * @param id_playlist
	 * @param track
	 */
	public void addTrackToPlaylist(int id_playlist, Track track);

	/**
	 * Remove a track from a playlist
	 * 
	 * @param id_playlist
	 * @param index
	 */
	public void deleteTrackFromPlaylist(int id_playlist, int index);

	/* Favorites methods */

	/**
	 * List the current user favorite releases
	 * 
	 * @return a collection with the releases
	 */
	public Collection<Release> getFavorities();

}
