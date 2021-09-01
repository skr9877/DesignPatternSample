package headfirst.composite.menu.Practice10;

import java.util.Iterator;
  
public class Waitress2 {		// 실습#10을 위해 수정한 클래스
	MenuComponent allMenus;
 
	public Waitress2(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegeterianMenu() {
		allMenus.printVegeterianMenu();
	}
	
	
}
