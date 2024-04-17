package Stream;

import java.util.*;
import java.util.stream.*;

public class StreamGfg {
	public static void main(String args[]) {
		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());

		System.out.println(result);

		// demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());

		System.out.println(show);

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());

		System.out.println(squareSet);

		// demonstration of forEach method
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		// demonstration of reduce method: Here ans variable is assigned 0 as the initial value and i is added to it.
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);
	}
}
