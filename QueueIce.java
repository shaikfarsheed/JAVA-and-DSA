package xyz;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIce {

	public static void main(String[] args) {
	Queue<String> qi =new LinkedList<String>();
	qi.add("prime 1");
	qi.add("prime 2");
	qi.add("prime 3");
	qi.add("prime 4");
	qi.add("prime 5");
	System.out.println(qi);
	String firstOut = qi.poll();
	System.out.println(firstOut);
	System.out.println(qi);
	System.out.println("the line is empty prime6 and prime7 can add "+qi);
	
	}

}
