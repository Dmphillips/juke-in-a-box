package model;

import java.util.ArrayList;

public class Songlists {

	ArrayList<Song> allSongs = new ArrayList<Song>();
	ArrayList<Song> playableSongs = new ArrayList<Song>();
	ArrayList<Song> overPlayedSongs = new ArrayList<Song>();
	
	public void checkAllPlays() {
		for(int i = 0; i < allSongs.size(); i++) {
			Song currSong = allSongs.get(i);
			if(currSong.canPlay())
				playableSongs.add(currSong);
			else
				overPlayedSongs.add(currSong);
		}
	}
	
}
