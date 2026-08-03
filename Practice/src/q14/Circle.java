package q14;

public class Circle extends Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void calculateArea(){
		double pi = 3.14;
		System.out.println("Circle Area is: " + (pi * r * r));
	}
}
