package q6;

//import java.util.Arrays;

public class countVovelsAndConsonants {
	
	public int[] solve(String s) {
		int[] ans = new int[2];
		//ans[0] -> no. of vovels, ans[1] -> no. of consonants
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
					ans[0]++;
				}
				
				else {ans[1]++;}
			}
		}
		
		return ans;
	}
}
