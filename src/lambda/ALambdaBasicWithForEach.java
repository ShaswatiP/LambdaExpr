package lambda;

import java.util.ArrayList;

public class ALambdaBasicWithForEach {

	public static void main(String[] args) {
		 ArrayList<Integer> arrL = new ArrayList<Integer>();
	        arrL.add(1);
	        arrL.add(2);
	        arrL.add(3);
	        arrL.add(4);

	        // here Lambda expression is used directly on collections, here it implements consumer functional interface
	        // Using lambda expression to print all elements of arrL
		// forEach The forEach() method takes a Consumer functional interface as a parameter. However, because of lambda expressions, you can pass a lambda expression as an argument to the forEach() method, and Java will automatically convert it to a Consumer instance.
	        arrL.forEach(n -> System.out.println(n));

	        // Using lambda expression to print even elements
	        // of arrL
	        arrL.stream().forEach(n -> {
	            if (n % 2 == 0)
	                System.out.println("using stream then for each :"+n);
	        });
	        
	        //forEach is stream.forEach()  so it is same as using stream() or not using	
	        arrL.forEach(n -> {
	            if (n % 2 == 0)
	                System.out.println("no stream :"+n);
	        });
	}

}
