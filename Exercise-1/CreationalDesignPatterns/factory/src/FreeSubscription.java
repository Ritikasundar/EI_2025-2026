package src;

public class FreeSubscription extends Subscription {

    @Override
    public void getSubscriptionDetails() {
        System.out.println("Free Plan: Access limited songs, Ads included.");
    }
}
