package headfirst.factory.pizzafm.Practice4;

public class CaliforniaStyleVeggiePizza extends Pizza {   // 실습 #4를 위해 추가한 클래스

	public CaliforniaStyleVeggiePizza() { 
		name = "California Style Crazy Veggie Pizza";
		dough = "Very Thin Crust Dough";
		sauce = "Bruschetta Sauce";
		
		toppings.add("marshed Potatoes with Roasted Garlic");
		toppings.add("Atrichike Hearts");
		toppings.add("Peanuts");
		toppings.add("Onions");
	}
 
}
