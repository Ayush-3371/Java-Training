package q14;

/**
 * This class extends the shape abstract class and gives its own
 * implementation for the calculateArea method for a rectangle.
 */

public class Rectangle extends Shape {
	private double width, length;
	
	public Rectangle() {};
	
	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Rectangle Area is: " + (width*length));
	}
}
