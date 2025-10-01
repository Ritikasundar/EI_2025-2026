package src;

/**
 * Flyweight class representing a Song
 */
public class Song {

    private String title; // Extrinsic state
    private SongMetadata metadata; // Intrinsic state shared among songs

    public Song(String title, SongMetadata metadata) {
        this.title = title;
        this.metadata = metadata;
    }

    public void play() {
        System.out.println("Playing song: " + title + " by " + metadata.getArtist() 
                           + " from album " + metadata.getAlbum() 
                           + " [" + metadata.getDuration() + " mins]");
    }
}
