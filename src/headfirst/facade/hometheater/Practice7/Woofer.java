package headfirst.facade.hometheater.Practice7;

public class Woofer {     //�ǽ� #8�� ���� ���� ���� class
	String description;
	Amplifier amplifier;

	
	public Woofer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;   // ���߿� Ȯ���� ���ؼ�.
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public String toString() {
		return description;
	}
}
