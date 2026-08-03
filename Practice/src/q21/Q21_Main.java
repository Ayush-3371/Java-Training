package q21;

public class Q21_Main {
	
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
