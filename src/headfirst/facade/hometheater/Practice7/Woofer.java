package headfirst.facade.hometheater.Practice7;

public class Woofer {     //실습 #8를 위해 새로 만든 class
	String description;
	Amplifier amplifier;

	
	public Woofer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;   // 나중에 확장을 위해서.
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
