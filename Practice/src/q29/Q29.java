package q29;

import java.util.function.BiFunction;

@FunctionalInterface

interface Func1{
	Integer add(Integer a, Integer b);
}

public class Q29 {
	
	public static void main(String[] args) {
		
		//Using Custom Functional Interface
		Func1 f = (a,b) -> a+b;
		System.out.println(f.add(38, 12));
		
		//Using pre-defined Functional Interface
		BiFunction<Integer, Integer, Integer> b = (x, y) -> x+y;
		System.out.println(b.apply(12, 18));
	}
}
