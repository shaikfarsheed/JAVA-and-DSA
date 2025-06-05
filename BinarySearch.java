package xyz;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {2,5,4,8,9,6};
		int target = 8;
		int left=0;
		int rigth = numbers.length-1;
		 boolean found =false;
		 while(left<=rigth) {
			 int mid=(left+rigth)/2;
			 if(numbers[mid]==target) {
				 System.out.println("found"+" "+target+"at index"+" "+mid);
				 found=true;
				 break;
				 
			 }else if(target<numbers[mid]) {
				 rigth=mid-1;
			 }else {
				 left=mid+1;
				 
			 }

	}
		 if(!found) {
			 System.out.println("Number not found");
		 }

}}
