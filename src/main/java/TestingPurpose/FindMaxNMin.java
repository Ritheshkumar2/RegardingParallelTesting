package TestingPurpose;

import org.testng.annotations.Test;

public class FindMaxNMin {
	
	@Test
	public void test() {
		
		int arr[]= {1,2,3,4,5,6};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
