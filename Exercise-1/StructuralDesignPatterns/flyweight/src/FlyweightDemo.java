package src;

public class FlyweightDemo {

    public static void main(String[] args) {

        SongFactory factory = new SongFactory();

        // Songs from the same artist/album share the same metadata
        SongMetadata metadata1 = factory.getSongMetadata("Taylor Swift", "Midnights", 3.5);
        SongMetadata metadata2 = factory.getSongMetadata("Taylor Swift", "Midnights", 3.5);

        // New metadata for different album
        SongMetadata metadata3 = factory.getSongMetadata("Adele", "30", 4.2);

        // Creating Song objects
        Song song1 = new Song("Anti-Hero", metadata1);
        Song song2 = new Song("Lavender Haze", metadata2);
        Song song3 = new Song("Easy On Me", metadata3);

        // Play songs
        song1.play();
        song2.play();
        song3.play();

        // Demonstrating shared metadata
        System.out.println("Metadata objects shared between song1 and song2: " + (metadata1 == metadata2)); // true
        System.out.println("Metadata objects shared between song1 and song3: " + (metadata1 == metadata3)); // false
    }
}
