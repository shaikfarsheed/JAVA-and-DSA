package xyz;

import java.util.TreeSet;
import java.util.Scanner;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> jjk = new TreeSet<String>();
        jjk.add("Monitor");
        jjk.add("Keyboard"); 
        jjk.add("Mouse");
        jjk.add("CPU");
        jjk.add("WebCam");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name:");
        String str = sc.nextLine(); 

        if (str.isEmpty()) { 
            System.out.println("The name is valid");
        } else {
            System.out.println("The name is invalid");
        }

        sc.close(); 
    }
}