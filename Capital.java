package xyz;
import java.util.TreeMap;

public class Capital {

	public static void main(String[] args) {
		TreeMap<String , String> cap=new TreeMap<String , String>();
		cap.put("India","New Delhi");
		cap.put("Usa","Washington");
		cap.put("germany","berlin");
		cap.put("japan","tokoyo");
		System.out.println(cap);
		System.out.println(cap.firstKey());
		System.out.println(cap.lastKey());
		System.out.println(cap.higherKey("Usa"));
		System.out.println(cap.lowerKey("japan"));
		
		
		

	}

}
