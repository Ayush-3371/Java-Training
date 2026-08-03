package q8;

import java.util.Scanner;

public class Q8 {
	
	public static int countDigits(int n) {
		int ans = 0;
		
		while(n > 0) {
			ans++;
			n /= 10;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to check for Armstrong number: ");
		
		int n = s.nextInt();
		
		int nc = n;
		
		int exp = countDigits(n);
		
		int ans = 0;
		
		while(n > 0) {
			int base = n%10;
			
			ans += Math.powExact(base, exp);
			
			n /= 10;
		}
		
		if(ans == nc) {
			System.out.println(nc + " is an Armstrong Number.");
		}else {
			System.out.println(nc + " is not an Armstrong Number.");
		}
		
		s.close();
		
		
	}
	
}
