package headfirst.composite.menu.Practice10;

import java.util.Iterator;
  
public class Waitress2 {		// �ǽ�#10�� ���� ������ Ŭ����
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
