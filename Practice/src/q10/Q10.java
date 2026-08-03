package q10;

public class Q10 {

	public static void main(String[] args) {
		int x = 10, y = 5, z =15;
		
		int ans = Integer.MIN_VALUE;
		
		ans = Math.max(x,ans);
		ans = Math.max(y, ans);
		ans = Math.max(z, ans);
		
		System.out.println(ans);
		
		
	}

}
