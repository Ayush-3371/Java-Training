package q21;

/**
 * This program accepts an integer as user input and throws NegativeNumberException .
 * when user gives a negative number as input.
 */
public class QTwentyOne {
	
	public static int add(int a, int b) throws NegativeNumberException{
		if(a < 0 || b < 0) {
			throw new NegativeNumberException("You can not use negative number in this operation.");
		}
		else {
			return a+b;
		}
	}

	public static void main(String[] args) {
		int a = 2;
		int b = -1;
		
		try {
			System.out.println(add(a,b));
		}catch(NegativeNumberException e) {
			e.printStackTrace();
		}
	}

}
