package ru.a148ru.examples.bparam;

import ru.a148ru.examples.lambdas.passcode.Apple;
import ru.a148ru.examples.lambdas.passcode.Color;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }

}
