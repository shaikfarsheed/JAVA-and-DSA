package xyz;
import java.util.*;

class Arraylist{
	public  Arraylist() {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		System.out.println("ArrayList"+ ar);
	}
}
class Linkedlist extends Arraylist{
	public  Linkedlist(){
		LinkedList<String>fa=new LinkedList<String>();
		fa.add("hinata");
		fa.add("nami");
		fa.add("mikasa");
		fa.add("orihimi");
		System.out.println("linkedlist"+fa);
	}
}
class Hashset extends Arraylist{
	public   Hashset() {
		HashSet<Integer>sh=new HashSet<Integer>();
		sh.add(10);
		sh.add(20);
		sh.add(30);
		sh.add(40);
		System.out.println("Hashset"+sh);
}
}
class Hashmap extends Arraylist{
	public  Hashmap() {
		HashMap< String,Integer>ds=new HashMap<String,Integer>();
		ds.put("Hinata",1);
		ds.put("nami",2);
		ds.put("mikasa",3);
		ds.put("orihimi",4);
		System.out.println("Hashmap"+ds);
	}
}

public class AllList {

	public static void main(String[] args) {
		Arraylist sl=new Arraylist();
		Linkedlist hl=new Linkedlist();
		Hashset se=new Hashset();
		Hashmap jjk=new Hashmap();

	}

}
