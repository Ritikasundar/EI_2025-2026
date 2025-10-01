package src;

public class SongMetadata {

    private String artist;
    private String album;
    private double duration; // in minutes

    public SongMetadata(String artist, String album, double duration) {
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public double getDuration() {
        return duration;
    }
}
