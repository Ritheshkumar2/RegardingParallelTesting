package TestingPurpose;

import org.testng.annotations.Test;

public class EvenAndOdd {
	
	@Test
	public void test() {
		
		int[] arr= {2,4,5,6,1};
		int evenCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.println(arr[i]);
				evenCount++;
			}
		}
		
		System.out.print("---"+evenCount);
	}

}
