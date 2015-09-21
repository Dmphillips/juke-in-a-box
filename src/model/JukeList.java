package model;

import java.util.ArrayList;

import songplayer.EndOfSongEvent;
import songplayer.EndOfSongListener;

public class JukeList {

	ArrayList<Song> playlist = new ArrayList<Song>();
	static boolean currentlyPlaying = false;
	
	private static class SongWaiter implements EndOfSongListener {
		public void songFinishedPlaying(EndOfSongEvent eosEvent) {
			System.out.println("Finished " + eosEvent.fileName() + ", " + eosEvent.finishedDate() + ", "
					+ eosEvent.finishedTime());
			currentlyPlaying = false;
		}
	}
	
}
