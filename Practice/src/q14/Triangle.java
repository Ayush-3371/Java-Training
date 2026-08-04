package q14;

/**
 * This class extends the shape abstract class and gives its own
 * implementation for the calculateArea method for a triangle.
 */

public class Triangle extends Shape {
	private double base, height;
	
	public Triangle() {};
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Triangle Area is: " + (0.5 * base * height));
	}
}
