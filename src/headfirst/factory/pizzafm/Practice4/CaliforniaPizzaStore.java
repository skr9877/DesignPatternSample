package headfirst.factory.pizzafm.Practice4;

public class CaliforniaPizzaStore extends PizzaStore {   // 실습 #4를 위해 추가한 클래스

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new CaliforniaStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new CaliforniaStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new CaliforniaStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new CaliforniaStylePepperoniPizza();
        	} else return null;
	}
}
