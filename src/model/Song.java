package model;

import java.time.LocalDate;

public class Song {

	public static int MAX_PLAYS = 3;
	private String title;
	private String fileName;
	private LocalDate lastDayPlayed;
	private int playedToday;

	public Song(String title, String fileName) {
		this.title = title;
		this.fileName = fileName;
		playedToday = 0;
		lastDayPlayed = LocalDate.now().minusYears(40);
	}

	public String getTitle() {
		return title;
	}

	public String getFileName() {
		return fileName;
	}

	public boolean canPlay() {
		return playedToday < MAX_PLAYS;
	}

	public void play() {
		if(playedToday >= MAX_PLAYS)
			return;
		lastDayPlayed = LocalDate.now();
		playedToday++;
	}
}