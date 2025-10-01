package src;

public class FreeSubscriptionFactory implements SubscriptionFactory {

    @Override
    public Subscription createSubscription() {
        return new FreeSubscription();
    }
}
