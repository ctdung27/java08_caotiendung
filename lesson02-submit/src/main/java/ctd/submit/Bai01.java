package ctd.submit;

public class Bai01 {
	
	  public static void main(String[] args) { 
		  int []arr = {5,9,8};
	  
	  sort(arr);
	  for (int i = 0;i < arr.length;i++) { 
		  System.out.print(arr[i] + " ");
		  } 
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
