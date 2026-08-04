package q30;

import java.util.function.Predicate;

/**
 * This program finds whether a string is empty or not using lambda expression.
 */

@FunctionalInterface
interface Func2{
	boolean check(String s);
}

public class QThirty {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		//Using Custom Functional Interface
		Func2 f2 = (s) -> s.isEmpty();
		
		System.out.println(f2.check(s1));
		
		//Using pre-defined Functional Interface
		Predicate<String> p = (s) -> s.isEmpty();
		
		System.out.println(p.test(s1));
		
		
	}

}
