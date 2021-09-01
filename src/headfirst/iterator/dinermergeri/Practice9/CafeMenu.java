package headfirst.iterator.dinermergeri.Practice9;

import java.util.*;

public class CafeMenu implements Menu {  	//실습 #9를 위해 추가/수정한 클래스
	LinkedList<MenuItem> menuItems = new LinkedList<MenuItem>();
  
	public CafeMenu() {
		addItem("Veggie Burger and Air Fries",
			"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
			true, 3.99);
		addItem("Soup of the day",
			"A cup of the soup of the day, with a side salad",
			false, 3.69);
		addItem("Burrito",
			"A large burrito, with whole pinto beans, salsa, guacamole",
			true, 4.29);
	}
 
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public LinkedList getItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}
