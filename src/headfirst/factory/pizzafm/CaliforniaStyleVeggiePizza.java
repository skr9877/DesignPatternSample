package headfirst.factory.pizzafm;

public class CaliforniaStyleVeggiePizza extends Pizza {
	public CaliforniaStyleVeggiePizza() {
		name = "California Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
}
