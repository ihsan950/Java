package finalassign;

import java.util.Scanner;

public class binary_search {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n= in.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("enter the values in a sorted order");
		
		for (int i = 0;i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("enter value to be searched");
		int num = in.nextInt();
		
		int low = 0;
		int high = n - 1;
		int mid = 0;
		
		while (low <= high) {
			
			mid = (low + high) / 2;
			if (arr[mid] == num) {
				System.out.println("value fount at :" + (mid+1));
				break;
			} else if (arr[mid] > num) {
				high = mid - 1;
				
			}else if (num > arr[mid]) {
				low = mid + 1;
			}
		 
			
		}
		if (low > high) {
			System.out.println("value is not found in an array");
		}
	}
}