
public class Song {
	private String title;
	private String artist;
	private int year;
	private double duration;

	
	public Song(String title, String artist, int year, double duration) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	

}
