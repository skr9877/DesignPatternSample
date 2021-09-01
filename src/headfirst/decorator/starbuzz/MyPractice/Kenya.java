package headfirst.decorator.starbuzz.MyPractice;

import headfirst.decorator.starbuzz.*;

public class Kenya extends Beverage {

    public Kenya(){
        description = "Kenya Coffee";
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
