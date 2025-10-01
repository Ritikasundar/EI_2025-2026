package src;

public class PremiumSubscription extends Subscription {

    @Override
    public void getSubscriptionDetails() {
        System.out.println("Premium Plan: Access all songs, Ad-free, Offline download.");
    }
}
