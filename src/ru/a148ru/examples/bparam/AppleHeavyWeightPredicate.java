package ru.a148ru.examples.bparam;

import ru.a148ru.examples.passcode.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }

}
