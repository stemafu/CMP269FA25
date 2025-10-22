
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

			if(index == 0) {
				return this.firstSongBox.getSong();
			}else if(index == count - 1) {
				return this.lastSongBox.getSong();
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
	
	
	/*
	 * The following method is used to replace a song at a given index.
	 * The method returns the replaced song. 
	 * If the indexes are invalid, the method should throw an
	 * IndexOutOfBoundsException
	 * 
	 * if the song parameter is also null, we have to throw a
	 * NullPointerException
	 */
	public Song replace(Song song, int index) {
		// Validate the index parameters and throw an exception
		
		
		if (song == null) {
			throw new NullPointerException("Song cannot be null");
		}
		
		Song replacedSong = null;
		if(index == 0) {
			// This means we are replacing the first song
			
			// Save the current song that is in the first song box
			replacedSong = this.firstSongBox.getSong();
			
			// Replace the song that is in the first song box with the one
			this.firstSongBox.setSong(song);
			
		}else if(index == (count - 1)) {
			// This means we are replacing the last song
			
			// Save the current song that is in the last song box
			replacedSong = this.lastSongBox.getSong();
			
			// Replace the song that is in the last song box with the one
			this.lastSongBox.setSong(song);
		}else{
			// Otherwise, we are replacing a specific song at some index
		
			int currentIndex = 0;
			SongBox currentSongBox = this.firstSongBox;

			while(currentIndex != index) {
				currentSongBox = currentSongBox.getNext();
				currentIndex++;
			}
			
			replacedSong = currentSongBox.getSong();
			
			currentSongBox.setSong(song);
		}
		
		return replacedSong;
	}
	
	
	/*
	 * The following method is used to remove and return a song 
	 * at the specified index.
	 * 
	 * If the index is not valid, the method should throw an
	 * IndexOutOfBoundsException.
	 */
	public Song remove(int index) {
		/* validate the index parameter and throw an exception
		if the index is invalid.
		*/
		if(index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("Invalid index");
			
		}
		
		Song removedSong = null;
		if(count == 1) {
			removedSong = this.get(0);
			removeAll();
		}else {
			
			int currentIndex = 0;
			SongBox previousSongBox = null;
			SongBox currentSongBox = this.firstSongBox;

			while(currentIndex != index) {
				previousSongBox = currentSongBox;
				currentSongBox = currentSongBox.getNext();
				currentIndex++;
			}
			
			if(index == 0) {
				removedSong = this.firstSongBox.getSong();
				SongBox newFirstSongBox = this.firstSongBox.getNext();
	
				this.firstSongBox.setNext(null);
				this.firstSongBox = newFirstSongBox;
				count--;
				
			}else if(index == count - 1) {
				// This means we are removing the last song
				// count is supposed to decrease by 1
				// Update the lastSongBox to be the previous songBox 
				
				removedSong = this.lastSongBox.getSong();
				this.lastSongBox = previousSongBox;
				this.lastSongBox.setNext(null);
				count--;
				
			}else {
				removedSong = currentSongBox.getSong();
				
				
				previousSongBox.setNext(currentSongBox.getNext());
				currentSongBox.setNext(null);
				count--;
			}
			
		
		}
		return removedSong;
	}
	
	
	public void removeAll() {
		this.firstSongBox = null;
		this.lastSongBox = null;
		this.count = 0;
	}
	
	/*
	 * The following method is used to add (insert) a song into the playlist
	 * at the given index. If the song is null, throw a NullPointerException
	 * and if the index is invalid, throw an IndexOutOfBoundsException.
	 */
	public void add(Song song, int index) {
		
	}


}
