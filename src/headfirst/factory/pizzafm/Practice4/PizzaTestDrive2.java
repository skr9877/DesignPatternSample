package headfirst.factory.pizzafm.Practice4;

public class PizzaTestDrive2 {	// �ǽ� #4�� ���� �߰��� Ŭ����
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();		
		PizzaStore californiaStore = new CaliforniaPizzaStore();

 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = californiaStore.orderPizza("cheese");
		System.out.println("Jason ordered a " + pizza.getName() + "\n");
		
		
		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = californiaStore.orderPizza("clam");
		System.out.println("Jason ordered a " + pizza.getName() + "\n");
		
		
		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
		pizza = californiaStore.orderPizza("pepperoni");
		System.out.println("Jason ordered a " + pizza.getName() + "\n");
		

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
		pizza = californiaStore.orderPizza("veggie");
		System.out.println("Jason ordered a " + pizza.getName() + "\n");
		
	}
}
