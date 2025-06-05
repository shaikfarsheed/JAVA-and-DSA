package xyz;
import java.util.Stack;

public class StackPlate {

	public static void main(String[] args) {
		Stack<String> sp =new Stack<String>();
		sp.push("Plate 1");
		sp.push("Plate 2");
		sp.push("Plate 3");
		sp.push("Plate 4");
		sp.push("Plate 5");
		System.out.println("Top Plate is"+ sp.peek());
		System.out.println("Serving"+sp.pop());
		if (sp.isEmpty());
		System.out.println("All -Plate are served");
		
	}

}
