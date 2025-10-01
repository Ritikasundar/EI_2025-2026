package src;

public class ObserverDemo {

    public static void main(String[] args) {

        // Create Music Artist
        MusicArtist artist = new MusicArtist("Taylor Swift");

        // Create Observers
        Observer mobileUser = new MobileAppUser("Ritika");
        Observer emailUser = new EmailUser("ritika@example.com");

        // Register observers
        artist.addObserver(mobileUser);
        artist.addObserver(emailUser);

        // Release new songs
        artist.releaseSong("Anti-Hero");
        artist.releaseSong("Lavender Haze");

        // Remove one observer
        artist.removeObserver(emailUser);

        // Release another song
        artist.releaseSong("Bejeweled");
    }
}
