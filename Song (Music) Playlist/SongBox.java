
public class SongBox {
	private Song song;
	private SongBox next;

	public SongBox(Song song) {
		this.song = song;
		this.next = null;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public SongBox getNext() {
		return next;
	}

	public void setNext(SongBox next) {
		this.next = next;
	}
	
	
	
}
