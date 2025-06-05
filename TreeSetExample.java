package xyz;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers=new TreeSet<Integer>();
		numbers.add(50);
		numbers.add(40);
		numbers.add(100);
		numbers.add(70);
		numbers.add(10);
		numbers.add(60);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(30));
		System.out.println(numbers.getLast());
		System.out.println(numbers.size());
		
		

	}

}
