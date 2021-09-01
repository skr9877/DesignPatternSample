package headfirst.decorator.starbuzz.Practice3;

public class Bubble extends CondimentDecorator {   //실습#3을 위해서 추가한 Class
	Beverage beverage;

	public Bubble(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Bubble";
	}

	public double cost() {
		return .25 + beverage.cost();
	}
}
