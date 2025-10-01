package src;

public class StrategyDemo {

    public static void main(String[] args) {

        RecommendationContext context = new RecommendationContext(new ByGenreStrategy());
        context.recommendSongs("Ritika"); // Output: Recommending songs by Genre

        context.setStrategy(new ByArtistStrategy());
        context.recommendSongs("Ritika"); // Output: Recommending songs by Artist

        context.setStrategy(new ByPopularityStrategy());
        context.recommendSongs("Ritika"); // Output: Recommending songs by Popularity
    }
}
