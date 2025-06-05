package xyz;
import java.util.Scanner;
public class prramdlon {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in); 
		        System.out.print("Enter a string: "); 
		        String original = scanner.nextLine(); 
		        String reversed = ""; 
		        for (int i = original.length() - 1; i >= 0; i--) {
		            reversed += original.charAt(i); 
		        if (original.equalsIgnoreCase(reversed)) {
		            System.out.println("The entered string is a palindrome.");
		        } else {
		            System.out.println("The entered string is NOT a palindrome."); 
		        }
		        scanner.close();
		    }
		}

	}


