package src;

public class ByArtistStrategy implements RecommendationStrategy {

    @Override
    public void recommend(String userName) {
        System.out.println("Recommending songs by Artist for user: " + userName);
        // Example: logic to fetch songs by user's favorite artists
    }
}
