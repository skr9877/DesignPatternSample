package headfirst.iterator.dinermergeri.Practice9;

import java.util.*;

public class MenuTestDrive2 {		// �ǽ�#9�� ���� �׽�Ʈ Ŭ����
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waitress2 waitress = new Waitress2(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenu();
		
		waitress.printVegetarianMenu();

		
	}
}
