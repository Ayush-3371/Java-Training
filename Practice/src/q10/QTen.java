package q10;

/**
 * This program finds and prints the maximum among three numbers.
 */

public class QTen {

	public static void main(String[] args) {
		int x = 10, y = 5, z =15;
		
		int ans = Integer.MIN_VALUE;
		
		ans = Math.max(x,ans);
		ans = Math.max(y, ans);
		ans = Math.max(z, ans);
		
		System.out.println(ans);
		
		
	}

}
