package headfirst.iterator.MyPractice;

import headfirst.iterator.dinermergercafe.Menu;
import headfirst.iterator.dinermergercafe.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CafeMenu implements Menu {
	List<MenuItem> menuItems = new LinkedList<>();
  
	public CafeMenu() {
		System.out.println("system on");

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
 
	public List getItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}
