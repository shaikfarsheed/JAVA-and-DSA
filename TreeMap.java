package xyz;
import java.util.TreeSet;

public class TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> student=new TreeMap();
		student.put(5, "Touseef");
		student.put(2, "Mohammed");
		student.put(3, "Farsheed");
		student.put(4, "Afrieed");
		student.put(1, "Abdul");
		student.put(1, "Rab");
		
		System.out.println(student);
		System.out.println(student.remove(2));
	}

}