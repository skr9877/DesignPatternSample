package headfirst.factory.pizzafm;

public class CaliforniaStyleClamPizza extends Pizza {

	public CaliforniaStyleClamPizza() {
		name = "California Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
