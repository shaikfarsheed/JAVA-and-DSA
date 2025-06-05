package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
	Queue<String> st =new LinkedList<String>();
	st.add("Student 1");
	st.add("Student 2");
	st.add("Student 3");
	st.add("Student 4");
	System.out.println(st);
	String firstOut=st.poll();
	System.out.println(firstOut);
	System.out.println(st);
	}

}
