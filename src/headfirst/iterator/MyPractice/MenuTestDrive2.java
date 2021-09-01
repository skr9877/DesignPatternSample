package headfirst.iterator.MyPractice;

import headfirst.iterator.dinermergercafe.DinerMenu;
import headfirst.iterator.dinermergercafe.PancakeHouseMenu;
import headfirst.iterator.dinermergercafe.Waitress;

public class MenuTestDrive2 {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 
		waitress.printMenu();
	}
}
