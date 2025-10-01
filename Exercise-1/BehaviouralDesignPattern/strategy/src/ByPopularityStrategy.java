package src;

public class ByPopularityStrategy implements RecommendationStrategy {

    @Override
    public void recommend(String userName) {
        System.out.println("Recommending songs by Popularity for user: " + userName);
        // Example: logic to fetch popular songs
    }
}
