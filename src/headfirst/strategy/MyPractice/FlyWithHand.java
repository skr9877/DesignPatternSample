package headfirst.strategy.MyPractice;

import headfirst.strategy.FlyBehavior;

public class FlyWithHand implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("난 손으로 난다요");
    }
}
