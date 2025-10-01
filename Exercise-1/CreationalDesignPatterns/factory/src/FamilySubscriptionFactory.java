package src;

public class FamilySubscriptionFactory implements SubscriptionFactory {

    @Override
    public Subscription createSubscription() {
        return new FamilySubscription();
    }
}
