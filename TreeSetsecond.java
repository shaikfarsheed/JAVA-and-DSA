package xyz;

import java.util.TreeSet;
public class TreeSetsecond {

	public static void main(String[] args) {
		TreeSet<Integer> numbers=new TreeSet<Integer>();
		numbers.add(5009);
		numbers.add(4998);
		numbers.add(5890);
		numbers.add(4633);
		numbers.add(5123);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(30));
		System.out.println(numbers.getLast());
		System.out.println(numbers.size());
		

	}

}
