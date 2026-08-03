package q14;

public class Rectangle extends Shape {
	private double width, length;
	
	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}
	
	public void calculateArea() {
		System.out.println("Rectangle Area is: " + (width*length));
	}
}
