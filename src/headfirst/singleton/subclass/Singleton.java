package headfirst.singleton.subclass;

public class Singleton {
	//protected static Singleton uniqueInstance;
	protected static Singleton uniqueInstance;
	// other useful instance variables here
 
	protected Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
			System.out.println("I've just made!\n"); 
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
