package xyz;

import java.util.*;

public class HashEX {

	public static void main(String[] args) {
	HashMap<String , Integer>hs=new HashMap<String , Integer>();
	hs.put("Apple", 40);
	hs.put("Milk", 50);
	hs.put("Biscute", 10);
	hs.put("Fiji", 200);
	hs.put("Banana", 30);
	System.out.println(hs);
	System.out.println(hs.remove("Fiji", 200));
	System.out.println(hs.put("Banana" , 40));
	System.out.println(hs);

	}

}
