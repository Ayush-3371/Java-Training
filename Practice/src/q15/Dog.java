package q15;

/**
 * This class extends Animal class and provides its own implementation for makeSound method.
 */

public class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Bark");
		
	}
}
