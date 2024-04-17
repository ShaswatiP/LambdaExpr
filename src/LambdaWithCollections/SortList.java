package LambdaWithCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(6,9,8,15,13);
		
		// Comparator is a functional Interface, compare() is an abstract method
		// here compare() is implemented using an Anonymous class
		Collections.sort(al,new Comparator<Integer>() {
		
			// also have to use 'Integer' simply 'int' won't work as Comparator type is Integer
			@Override
			public int compare(Integer x,Integer y) {
				if(x > y) {
				return 1;
				}
				else if(x == y) {
					return 0;
				}
				return -1;
			}
		
		});
		System.out.println("in sorted order :"+al);

		
		//the functional Interface Comparator and the abstract method compare() are implemented using Lambda function
		Collections.sort(al,(Integer x, Integer y) -> {
				if(x < y) {
				return 1;
				}
				else if(x == y) {
					return 0;
				}
				return -1;
		} );
		System.out.println("in reverse sorted order :"+al);
		
		// Ternary operator used to reduce the if-else block
		Collections.sort(al,(Integer x,Integer y)-> (x >y) ? 1 : (x == y) ? 0 : -1);
		System.out.println("in sorted order :"+al);	
		
		// can remove Integer type from Lambda function, it infers the type itself
		Collections.sort(al,(x, y)-> (x <y)? 1 : (x == y) ? 0 : -1);
		System.out.println("in reverse sorted order :"+al);
	}

}
