package headfirst.iterator.dinermergeri.Practice9;

import java.util.*;

public class MenuTestDrive2 {		// 실습#9를 위한 테스트 클래스
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waitress2 waitress = new Waitress2(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenu();
		
		waitress.printVegetarianMenu();

		
	}
}
