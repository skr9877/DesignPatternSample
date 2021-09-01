package headfirst.composite.menu.Practice10;

import java.util.Iterator;
import java.util.ArrayList;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;
    
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}
  
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}
	

	public void printVegeterianMenu() {  	// 실습#10용 추가 코드
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.println(", " + getPrice());
			System.out.println("     -- " + getDescription());
		}
	}
}
