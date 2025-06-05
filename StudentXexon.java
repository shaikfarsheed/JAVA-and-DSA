package xyz;

public class StudentXexon {

	public static void main(String[] args) {
		int[] number= {5,8,2,9,7};
		int target =0;
		
		boolean found =false;
		for(int i=0;i<number.length;i++) {
			System.out.println("found + " + target+ "at index"+number[i]);
			found = true;
			break;
		}
	if(!found) {
		System.out.println("number" + target + "not found");
	}

	}}
 