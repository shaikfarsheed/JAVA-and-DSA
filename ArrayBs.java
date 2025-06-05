package xyz;

import java.util.Scanner;
public class ArrayBs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String [] names={"hinata","nami","mikasa","nel"};
		String str=sc.nextLine();
		if(str.isEmpty()) {
			System.out.println("the name is exist"+""+"valid");
		}else {
			System.out.println("No exist name"+""+"invalid");
		}
        sc.close();
	}

}
