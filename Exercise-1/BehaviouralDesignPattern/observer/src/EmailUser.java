package src;

public class EmailUser implements Observer {

    private String email;

    public EmailUser(String email) {
        this.email = email;
    }

    @Override
    public void update(String artistName, String songName) {
        System.out.println("Email [" + email + "] notification: " + artistName 
                           + " released a new song: " + songName);
    }
}
