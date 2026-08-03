package q23;

import java.util.ArrayList;
import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of integers you want to add to list: ");
		
		int n = s.nextInt();
		
		System.out.println("Enter the numbers one by one: ");
		
		for(int i=0; i<n; i++) {
			int temp = s.nextInt();
			list.add(temp);
		}
		
		s.close();
		
		CountFrequency c = new CountFrequency();
		
		ArrayList<ArrayList<Integer>> ans = c.count(list);
		
		System.out.println(ans);
		
	}

}
