package xyz;

import java.util.TreeSet;
import java.util.Comparator;
public class TreeSetThrid {

	public static void main(String[] args) {
		TreeSet<String>ff=new TreeSet<String>(Comparator.reverseOrder());
		ff.add("sumit");
		ff.add("karan");
		ff.add("Anjali");
		ff.add("mohan");
		ff.add("Zoya");
		System.out.println("ff");
		for(String names:ff) {
		System.out.println(names);
		}
	}

}
