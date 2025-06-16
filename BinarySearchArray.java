package xyz;

import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args) {
        String[] str = {"array", "fara", "sha", "kayva", "zara"};
        Arrays.sort(str);
        String target = "sha";
        int left = 0;
        int right = str.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = target.compareTo(str[mid]); 
            if (comparison == 0) {
                System.out.println("Found " + target + " at index " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) {
            System.out.println("String not found");
        }
    }
}