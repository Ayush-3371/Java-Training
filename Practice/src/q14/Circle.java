package q14;

/**
 * This class extends the shape abstract class and gives its own
 * implementation for the calculateArea method for a circle.
 */

public class Circle extends Shape {
	private double r;
	
	public Circle() {};
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	
	public void calculateArea(){
		double pi = 3.14;
		System.out.println("Circle Area is: " + (pi * r * r));
	}
}
