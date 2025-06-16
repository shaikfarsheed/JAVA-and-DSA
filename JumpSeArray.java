package xyz;


public class JumpSeArray {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n); 
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < target) { 
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) return -1; 
        }
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) return i;
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;
        int index = jumpSearch(arr, target);
        System.out.println((index != -1) ? "Found at index " + index : "Not Found");
    }
}