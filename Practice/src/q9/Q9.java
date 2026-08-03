package q9;

import java.util.Scanner;

public class Q9 {
	
	public static int sumDigits(int n) {
		int ans = 0;
		
		while(n > 0) {
			ans += (n%10);
			n /= 10;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int n = s.nextInt();
		
		System.out.println(sumDigits(n));
		
		s.close();
	}

}
