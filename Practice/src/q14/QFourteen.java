package q14;

/**
 * This program uses the classes Circle, Rectangle & Triangle
 * to calculate the respective areas for each kind of objects.
 */
public class QFourteen {

	public static void main(String[] args) {
		Circle c = new Circle(4.0);
		Rectangle r = new Rectangle(2.0, 4.0);
		Triangle t = new Triangle(4.0, 5.0);
		
		c.calculateArea();
		r.calculateArea();
		t.calculateArea();
	}

}
