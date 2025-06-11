package xyz;


public class BubbleStr {
    public static void main(String[] args) {
        String[] string = {"A", "R", "F", "S", "H", "E", "D"};
        
        for (int i = 0; i < string.length-1; i++) {
            for (int j = 0; j < string.length-1-i; j++) { 
                if (string[j].compareTo(string[j+1])>0) { 
                    String temp = string[j];
                    string[j] = string[j+1];
                    string[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted list:");
        for (String strs : string) {
            System.out.println(strs);
        }
    }
}