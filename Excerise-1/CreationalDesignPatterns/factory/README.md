# Factory Pattern - Subscription Plans (Online Music Streaming App)

## Description
This module demonstrates the **Factory Design Pattern** using an Online Music Streaming App example.
It shows **creating different subscription plans** (Free, Premium, Family) **without using switch-case**, following **Open-Closed Principle**.

## Classes
1. **Subscription.java** - Abstract class for subscription plans.
2. **FreeSubscription.java** - Free plan implementation.
3. **PremiumSubscription.java** - Premium plan implementation.
4. **FamilySubscription.java** - Family plan implementation.
5. **SubscriptionFactory.java** - Factory interface.
6. **FreeSubscriptionFactory.java** - Concrete factory for Free plan.
7. **PremiumSubscriptionFactory.java** - Concrete factory for Premium plan.
8. **FamilySubscriptionFactory.java** - Concrete factory for Family plan.
9. **Client.java** - Client class that uses the factory.
10. **FactoryDemo.java** - Demo to run the factories.

## How to Run
1. Navigate to the factory folder
2. Compile:
javac -d bin src/*.java
3. Run:
java -cp bin src.FactoryDemo

