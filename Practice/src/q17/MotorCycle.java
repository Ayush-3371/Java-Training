package q17;

/**
 * This class extends the vehicle abstract class and provides its own 
 * implementation for startEngine & stopEngine methods for MotorCycle.
 */

public class MotorCycle extends Vehicle {

	@Override
	public void startEngine() {
		System.out.println("MotorCycle engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("MotorCycle engine stopped");
	}

}
