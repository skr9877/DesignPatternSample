package headfirst.strategy.Practice1;
import java.util.Scanner;


public class MiniDuckSimulator2 {        // �ǽ������� �߰��� Ŭ����
	
	static Scanner scan = new Scanner(System.in);
 
	public static void main(String[] args) {
 
		//MallardDuck	mallard = new MallardDuck();
		//RubberDuck	rubberDuckie = new RubberDuck();
		//DecoyDuck	decoy = new DecoyDuck();
 		ModelDuck	model = new ModelDuck();

		//mallard.performQuack();
		//rubberDuckie.performQuack();
		//decoy.performQuack();
 		//model.performQuack();	

 		

 		for(int i=0; i < 3; ++i)
 		{		
 		
 		System.out.println("���ڸ� �Է��Ͻÿ� (1 ~ 3):");

 		int input = scan.nextInt();

 			
 		switch(input) {
 			case 1:
 				model.setFlyBehavior(new FlyRocketPowered());
 				model.performFly();
 				break;
 				
 			case 2:
 				model.setFlyBehavior(new FlyWithWings());
 				model.performFly();
 				break;
 				
 			case 3:
 				model.setFlyBehavior(new FlyNoWay());
 				model.performFly();
 				break;
 				
 			default:
 				System.out.println("1 ~ 3 �̿��� ���� �Էµ�");
 				break;
 		}
 		
 		}

	}
}
