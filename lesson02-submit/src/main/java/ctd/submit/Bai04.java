package ctd.submit;

import java.util.Scanner;

public class Bai04{
	public static void main(String[] args) {
		int n,j,i ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban muốn nhập bao nhiêu số?: ");
		n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Nhâp các số: ");
		for( j= i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if ((arr[i] % 2) != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		if (j < 2) {
			System.out.println("Không có số lẻ lớn nhất thứ 2");
		}
		n = j;
		sort(arr);
		System.out.println(arr[j-2]);
	}
	public static void sort(int arr[]) { 
		  int tmp = arr[0];
		  for (int i =0; i < arr.length; i++) {
			  for (int j = i+1; j < arr.length; j++) { 
				  if(arr[i]> arr[j]) {
					  tmp = arr[j];
					  arr[j] = arr[i]; 
					  arr[i] = tmp; 
					  } 
				  } 
			  } 
		  }

	
	
}
