package LambdaWithCollections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(
				(String s1,String s2)->{
					if(s1.compareTo(s2) == 1) {
						return 1;
					}
					else if(s1.compareTo(s2) == 0) {
						return 0;
					}
					return -1;
		});

		ts.add("app");
		ts.add("hi");
		ts.add("hello");
		ts.add("xxxx");
		
		System.out.println("reverse order sorted in treeSet constructor:");
		ts.stream().forEach(s -> System.out.print(s +" "));
		System.out.println();
		
		System.out.println("sorted in stream using sorted method:");
		ts.stream().sorted((s1,s2)->s1.compareTo(s2)).forEach(s -> System.out.print(s+" "));
		
		System.out.println("\nsorted in a single line:");
		ts = new TreeSet<String>((s1,s2)->s1.compareTo(s2));

		
		ts.add("hi");
		ts.add("hello");
		ts.add("app");
		ts.add("xxxx");
		
		ts.stream().forEach(s -> System.out.print(s +" "));
		System.out.println();
		
		// HashSet constructor doesn't take Comaprator as argument
		HashSet<String> h = new HashSet<String>();
		h.add("hi");
		h.add("hello");
		ts.add("xxxx");
		
		HashSet<String> hh = (HashSet<String>) h.stream().map((x -> x+"xy")).collect(Collectors.toSet());
		hh.stream().forEach(s -> System.out.print(s +" "));
	}
}
