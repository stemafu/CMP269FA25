
public class Playlist {
	
	/*
	 * firstSongBox will be used to keep the address to the first
	 * box that contains the first song in the playlist.
	 * 
	 * lastSongBox will be used to keep an address to the last
	 * box that contains the last song in the playlist.
	 * 
	 * The variable count will used to keep track of the amount of
	 * songs that are currently in the playlist
	 */
	private SongBox firstSongBox;
	private SongBox lastSongBox;
	private int count;
	
	
	public Playlist() {
		firstSongBox = null;
		lastSongBox = null;
		count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return (count == 0);
	}
	
	/*
	 * The following method will be used to add a new song to the
	 * end of the playlist. 
	 * 
	 * Remember a song has to placed into a SongBox to be added to 
	 * the playlist.
	 * 
	 */
	public void add(Song song) throws NullPointerException{
		if (song == null) {
			throw new NullPointerException("Song cannot be null");
		}
		
		/*
		 * Songs in the playlist must be placed inside a SongBox.
		 * For each song passed as a parameter, we have to create a
		 * SongBox for it.
		 */
		SongBox newSongBox = new SongBox(song);
		
		if(this.isEmpty()) {
			this.firstSongBox = newSongBox;
			this.lastSongBox = newSongBox;
			this.count++;
		}else {
			/* When the list is not empty, we want to add the
			 * new box of our song to the end of the playlist.
			 * 
			 * Remember that we already have an instance variable
			 * that keeps track of the last song box in the playlist.
			 */
			lastSongBox.setNext(newSongBox);
			
			// update the last song to the new song
			lastSongBox = newSongBox;
			this.count++;
		}
		
		
		
		
	}
	
	public Song get(int index) {
		
		// We may need to take care of invalid indexes here
		
		if(this.isEmpty()) {
			return null;
		}else {
			int currentIndex = 0;
			SongBox currentSongBox = this.firstSongBox;
			while(currentIndex != index) {
				currentSongBox = currentSongBox.getNext();
				currentIndex++;
			}
			
			return currentSongBox.getSong();
		}
	}
}
