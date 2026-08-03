package q14;

public class Q14 {

	public static void main(String[] args) {
		Circle c = new Circle(4.0);
		Rectangle r = new Rectangle(2.0, 4.0);
		Triangle t = new Triangle(4.0, 5.0);
		
		c.calculateArea();
		r.calculateArea();
		t.calculateArea();
	}

}
