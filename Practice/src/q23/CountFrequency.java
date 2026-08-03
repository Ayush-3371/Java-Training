package q23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	
	private HashMap<Integer,Integer> mpp = new HashMap<>();
	
	public ArrayList<ArrayList<Integer>> count(ArrayList<Integer> list){
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		int n = list.size();
		
		for(int i=0; i<n; i++) {
			Integer num = list.get(i);
			mpp.put(num, mpp.getOrDefault(num, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(entry.getKey());
			temp.add(entry.getValue());
			ans.add(temp);
		}
		
		return ans;
	
	}
}
