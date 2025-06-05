package xyz;

import java.util.*;

public class StackQueue {

	public static void main(String[] args) {
		Stack<String> bt =new Stack<String>();
		Queue<String> st =new LinkedList<String>();
		bt.push("toycar");
		bt.push("toyplane");
		bt.push("ball");
		System.out.println("top toy taking by kids is"+ bt.peek());
		System.out.println("Serving"+bt.pop());
		System.out.println("bt");
		
		st.add("leo");
		st.add("hinata");
		st.add("sakura");
		System.out.println(st);
		String firstOut=st.poll();
		System.out.println(firstOut);
		System.out.println(st);
		
		System.out.println("All -toy are served"+st);
	}

}
