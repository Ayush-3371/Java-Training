package q31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Q31 {
	
	@FunctionalInterface
	interface Func3{
		void covert(ArrayList<String> list);
	}

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		Collections.addAll(strList, "Apple", "Banana", "Oranges", "Grapes");
		
		//Using Custom Functional Interface
		Func3 f3 = (s) -> s.replaceAll(str->str.toUpperCase());
		
		f3.covert(strList);
		System.out.println(strList);
		
		strList.replaceAll(s->s.toLowerCase());
		
		//Using pre-defined Functional Interface
		Consumer<ArrayList<String>> f = (s) -> s.replaceAll(str->str.toUpperCase());
		
		f.accept(strList);
		System.out.println(strList);
		
	}

}
