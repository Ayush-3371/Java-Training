package q5;

public class ReverseString {
	public String reverse(String s) {
		StringBuffer res = new StringBuffer("");
		int n = s.length();
		for(int i= n-1; i>=0; i--) {
			char ch = s.charAt(i);
			res.append(ch);
		}
		
		return res.toString();
	}
}
