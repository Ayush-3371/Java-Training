package q14;

public class Triangle extends Shape {
	private double base, height;
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	
	public void calculateArea() {
		System.out.println("Triangle Area is: " + (0.5 * base * height));
	}
}
