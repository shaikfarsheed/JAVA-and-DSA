package xyz;

abstract class Car{
	abstract void start();
	abstract void drive();
	abstract void stop();
	
	void MusicSystem() {
		System.out.println("Playing Music");
	}
}
public class AbstractEx {
	void start() {
		System.out.println("car started using Start button");
	}
	void drive() {
		System.out.println("car moved to one place to another place");
	}
	void stop() {
		System.out.println("car stopped using the stop buttom");
	}

	public static void main(String[] args) {
		AbstractEx mycar=new AbstractEx();
		mycar.start();
		mycar.drive();
		mycar.stop();
		
		

	}

}
