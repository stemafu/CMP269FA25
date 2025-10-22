
public class PlaylistTester {

	public static void main(String[] args) {
		
		Playlist list = new Playlist();
		
		Song song1 = new Song("title 1", "Daddy Yankee", 2024, 3.5);
		Song song2 = new Song("title 2", "Jay Z", 2025, 4.5);
		Song song3 = new Song("title 3", "Panic @ the Disco", 2025, 4.5);
		
		Song song4 = new Song("Bronx Lincoln Park", "AC", 2000, 2.5);
		
		
		list.add(song1);
		list.add(song2);
		list.add(song3);
		System.out.println(list.size());
		System.out.println(list.get(1));
		
		System.out.println(list.replace(song4, 1));
		System.out.println(list.get(1));
		
	}

}
