package headfirst.decorator.starbuzz.Practice3;

public class StarbuzzCoffeeBubble {     //실습#3을 위해서 추가한 Class
 
	public static void main(String args[]) {
		Beverage beverage = new Kenya();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new Kenya();
		beverage2 = new Soy(beverage2);
		beverage2 = new Bubble(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
		
		Beverage beverage3 = new Kenya();
		beverage3 = new Milk(beverage3);
		beverage3 = new Bubble(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
 	}
}
