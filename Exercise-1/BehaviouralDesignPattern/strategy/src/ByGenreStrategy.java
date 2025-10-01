package src;

public class ByGenreStrategy implements RecommendationStrategy {

    @Override
    public void recommend(String userName) {
        System.out.println("Recommending songs by Genre for user: " + userName);
        // Example: logic to fetch songs by user's preferred genres
    }
}
