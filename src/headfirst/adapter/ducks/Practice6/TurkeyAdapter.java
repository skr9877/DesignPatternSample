package headfirst.adapter.ducks.Practice6;

public class TurkeyAdapter implements Duck {   	// �ǽ� #7���� ���� class
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
