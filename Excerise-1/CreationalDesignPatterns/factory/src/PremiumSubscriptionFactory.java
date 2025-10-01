package src;

public class PremiumSubscriptionFactory implements SubscriptionFactory {

    @Override
    public Subscription createSubscription() {
        return new PremiumSubscription();
    }
}
