package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic {


	public static void main(String[] args) {
	
		List<Integer> num = new ArrayList<>();
		for(int i=0;i<10;i++) {
			num.add(i);
		}
		
		// iterate with stream, apply a filter and then collect to a List
		List<Integer> even = num.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
		System.out.println(even);		
	
		// approach - 1 : create Stream object using Stream.of() 
		Object[] a = num.toArray();
		Stream<Object> st = Stream.of(a);
		st.forEach(e -> {
			System.out.println(e);
		});
	
		// approach - 1 : create Stream object using stream() 
		Stream<Integer> stream = even.stream();
		stream.forEach(e -> {
			System.out.println(e);
		});
		
		// methods of Stream
		// filter(), argument is a predicate
		// filters out elements from the stream, which pass a certain condition/predicate argument
		List<String> names = List.of("sha","shy","shu","shi","shd","bubu");
		names.stream().filter(e -> e.startsWith("b")).forEach(e -> System.out.println(e));
		
		// map() -> applies some operation on each element and returns the results 
		List<Integer> squares = num.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(squares);
	}
}
