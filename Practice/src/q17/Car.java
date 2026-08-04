package q17;

/**
 * This class extends the vehicle abstract class and provides its own 
 * implementation for startEngine & stopEngine methods for Car.
 */

public class Car extends Vehicle {

	public void startEngine() {
		System.out.println("Car engine started");
	}

	public void stopEngine() {
		System.out.println("Car engine stopped");
	}

}
