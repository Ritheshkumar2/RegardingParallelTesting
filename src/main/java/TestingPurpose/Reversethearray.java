package TestingPurpose;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Reversethearray {
	
	@Test
	public void test() {
		
		int[] arr= {1,2,3,4,5,6,7};
		
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		//System.out.print(Arrays.toString(arr));
		
		for(int num:arr) {
			System.out.print(num);
		}
		
	}

}
