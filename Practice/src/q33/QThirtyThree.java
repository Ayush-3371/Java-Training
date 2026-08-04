package q33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 * This program finds the average of list of doubles using Lambda expression.
 */

@FunctionalInterface
interface Func4{
	Double calculateAvg(ArrayList<Double> list);
}

public class QThirtyThree {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>(Arrays.asList(10.0, 15.0, 25.0, 30.0, 45.0));
		
		//Using pre-defined Functional Interface
		Function<ArrayList<Double>, Double> f = ls -> {
			Double sum = 0.0;
			for(int i=0; i<ls.size(); i++) {
				sum += ls.get(i);
			}
			return (sum/ls.size());
		};
		
		System.out.println("The average of the list is : " + f.apply(list));
		
		//Using Custom Functional Interface
		Func4 f4 = ls -> {
			Double sum = 0.0;
			for(int i=0; i<ls.size(); i++) {
				sum += ls.get(i);
			}
			return (sum/ls.size());
		};
		
		System.out.println("The average of the list is : " + f4.calculateAvg(list));
	}

}
