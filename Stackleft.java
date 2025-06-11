package xyz;
import java.util.*;
public class Stackleft {

	public static void main(String[] args) {
		Stack<String>su=new Stack<String>();
		su.push("sunli");
		su.push("aliya");
		su.push("king");
		su.push("suui");
		su.push("zeka");
		System.out.println(su);
		System.out.println("push of lara into stack "+su.push("lara"));
		
		String st=su.pop();
		System.out.println("pop of "+st);
		System.out.println("undo of "+su.push(st));
		System.out.println(su);

	}

}
